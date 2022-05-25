package cn.ios.junit.config;

import cn.ios.junit.util.log.Log;
import com.google.common.collect.Lists;
import soot.*;
import soot.options.Options;

import java.io.File;
import java.util.List;
import java.util.Map;

public class SootConfig {
	public static void configurator(String jrePath) {
		G.reset();
		String jreDir = jrePath + "/lib/jce.jar";
		String jceDir = jrePath + "/lib/rt.jar";
		String path = jreDir + File.pathSeparator + jceDir;

		List<String> processDir = Lists.newArrayList();
		processDir.add(GlobalCons.TEST_SOURCE_FOLDER);
		Options.v().set_soot_classpath(path);
		Options.v().set_include_all(true);
		Options.v().set_process_dir(processDir);
		Options.v().set_no_bodies_for_excluded(true);
		Options.v().set_output_format(Options.output_format_shimple);
		Options.v().set_allow_phantom_refs(true);

		Options.v().set_src_prec(Options.src_prec_only_class);  // class
//		Options.v().set_src_prec(Options.src_prec_c);  // jar



		Options.v().allow_phantom_refs();
		Options.v().set_whole_program(true);

		Pack p1 = PackManager.v().getPack("jtp");
		String phaseName = "jtp.bt";

		Transform t1 = new Transform(phaseName, new BodyTransformer() {
			@Override
			protected void internalTransform(Body b, String phase, Map<String, String> options) {
				try {
					b.getMethod().setActiveBody(b);
				} catch (Exception e) {
					Log.e(e);
				}
			}
		});

		p1.add(t1);

		soot.Main.v().autoSetOptions();

		try {
			Scene.v().loadNecessaryClasses();
			PackManager.v().runPacks();
		} catch (Exception e) {
			e.printStackTrace();
			Log.e(e);
		}


	}
}

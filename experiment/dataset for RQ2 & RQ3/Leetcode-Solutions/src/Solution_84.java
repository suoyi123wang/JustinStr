import java.util.*;
// for title: html-entity-parser
public class Solution_84 {
    public String entityParser(String text) {
        StringBuffer sb = new StringBuffer();
        int length = text.length();
        int entityStart = -1;
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (c == '&') {
                if (entityStart >= 0) {
                    sb.append(text.substring(entityStart, i));
                }
                entityStart = i;
            } else {
                if (entityStart >= 0) {
                    if (c == ';') {
                        String entity = text.substring(entityStart, i + 1);
                        String specialCharacter = getCharacter(entity);
                        sb.append(specialCharacter);
                        entityStart = -1;
                    }
                } else {
                    sb.append(c);
                }
            }
        }
        if (entityStart >= 0) {
            sb.append(text.substring(entityStart));
        }
        return sb.toString();
    }

    public String getCharacter(String entity) {
        switch (entity) {
        case "&quot;":
            return "\"";
        case "&apos;":
            return "\'";
        case "&amp;":
            return "&";
        case "&gt;":
            return ">";
        case "&lt;":
            return "<";
        case "&frasl;":
            return "/";
        default:
            return entity;
        }
    }
}

package com.google.protobuf;

final class dr {
    static String m33300a(C7203j c7203j) {
        dt dsVar = new ds(c7203j);
        StringBuilder stringBuilder = new StringBuilder(dsVar.mo6185a());
        for (int i = 0; i < dsVar.mo6185a(); i++) {
            byte a = dsVar.mo6184a(i);
            switch (a) {
                case (byte) 7:
                    stringBuilder.append("\\a");
                    break;
                case (byte) 8:
                    stringBuilder.append("\\b");
                    break;
                case (byte) 9:
                    stringBuilder.append("\\t");
                    break;
                case (byte) 10:
                    stringBuilder.append("\\n");
                    break;
                case (byte) 11:
                    stringBuilder.append("\\v");
                    break;
                case (byte) 12:
                    stringBuilder.append("\\f");
                    break;
                case (byte) 13:
                    stringBuilder.append("\\r");
                    break;
                case (byte) 34:
                    stringBuilder.append("\\\"");
                    break;
                case (byte) 39:
                    stringBuilder.append("\\'");
                    break;
                case (byte) 92:
                    stringBuilder.append("\\\\");
                    break;
                default:
                    if (a >= (byte) 32 && a <= (byte) 126) {
                        stringBuilder.append((char) a);
                        break;
                    }
                    stringBuilder.append('\\');
                    stringBuilder.append((char) (((a >>> 6) & 3) + 48));
                    stringBuilder.append((char) (((a >>> 3) & 7) + 48));
                    stringBuilder.append((char) ((a & 7) + 48));
                    break;
            }
        }
        return stringBuilder.toString();
    }
}

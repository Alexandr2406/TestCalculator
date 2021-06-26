public class Converter {

    public static String roman(int n) {
        if (n <= 0) {//если число меньше 0, то кидаем исключение
            throw new IllegalArgumentException("отрицательные римские числа не допускаются по заданию");
        }
        StringBuilder buf = new StringBuilder();

        final RomaNum[] values = RomaNum.values();
        for (int i = values.length - 1; i >= 0; i--) {
            while (n >= values[i].arab) {
                buf.append(values[i]);
                n -= values[i].arab;
            }
        }
        return buf.toString();
    }


    public static int toArab (String roma){
        switch (roma){
            case "I":  return 1;
            case "II": return 2;
            case "III": return 3;
            case "IV": return 4;
            case "V": return 5;
            case "VI": return 6;
            case "VII": return 7;
            case "VIII": return 8;
            case "IX": return 9;
            case "X": return 10;
            default: return -1;
        }
    }
}

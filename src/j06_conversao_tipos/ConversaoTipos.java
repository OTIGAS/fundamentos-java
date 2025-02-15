package j06_conversao_tipos;

public class ConversaoTipos {
    public static void main(String[] args) {
        double doubleNumber01 = 123.456;
        int intNumber01 = (int) doubleNumber01;
        System.out.println("Conversão de Tipos 01 " + intNumber01);

        Double doubleNumber02 = 123.456;
        Integer intNumber02 = doubleNumber02.intValue();
        System.out.println("Conversão de Tipos 02: " + intNumber02);

        String stringNumber03 = "100";
        int intNumber03 = Integer.parseInt(stringNumber03);
        double doubleNumber03 = Double.parseDouble(stringNumber03);
        System.out.println("Conversão de Tipos 03: " + stringNumber03 + doubleNumber03);

        Integer obj1 = Integer.valueOf("100");
        Integer obj2 = Integer.valueOf("100");
        System.out.println("Comparação: " + obj1.equals(obj2));
        System.out.println("Diferença: " + obj1.compareTo(obj2));

        System.out.println("Valor Máximo INT" + Integer.MAX_VALUE); // 2147483647
        System.out.println("Valor Minimo INT" + Integer.MIN_VALUE); // -2147483648
    }
}

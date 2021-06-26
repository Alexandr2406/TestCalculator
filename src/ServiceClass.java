public class ServiceClass {
//вытаскиваю параметры из запроса
    public String[] params(String param){
        //разделяю строку по "оператору"
        if(!getOperator(param).equals("1")) {
            String[] parts = param.split("[-/[+][*]]+");
            return parts;
        }
       else throw new ArithmeticException("не верно введены параметры");
    }

//вытаскиваю оператор из запроса
    public String getOperator(String param){
        char find = 0;
        //преобразоваваю сторку в массив символов и ищу нужный мне первый оператор, после чего останавливаю поиск
        char[] rt = param.toCharArray();
        //проверяю на наличие/отсутствие операторов в начале примера
        if(rt[0] == '+' || rt[0] == '-' || rt[0] == '*' || rt[0] == '/'){throw new ArithmeticException("по условию задачи числа должны быть положительными, " +
                "без каких либо символов в начале. Попробуйте еще раз");}

        for (int i = 0; i < rt.length; i++) {
            if (rt[i] == '+' || rt[i] == '-' || rt[i] == '*' || rt[i] == '/') {
                find = rt[i];
                break;
            }
            //если не нашёл верну 1
            find=1;
        }
        return Character.toString(find);
    }

// проверяю параметры на совместимость
    public boolean checkParams(String[] params) {
       //проверяю, если параметр 1, то есть в примере не было введено нужных нам операторов для выполнения действия
        if(params.length<2){
            throw new ArithmeticException("Оператор отсутствует, либо введен не верно");}

       // Класс Object является отличным инструментом для таких вещей
        Object param1;
        Object param2;

 //пробую привести входной параметр к int, если не получается , привожу к String
        try {
            param1 = Integer.parseInt(params[0]);
        } catch (NumberFormatException e) {
            param1 = params[0];
        }

        try {
            param2 = Integer.parseInt(params[1]);
        } catch (NumberFormatException e) {
            param2 =params[1];
        }
        //сравниваю классы параметров
        return (param1.getClass().equals(param2.getClass()));
    }

//проверка: с какими числами работать, а именно проверка на арабское число
public boolean checkArabArray(String[] params) {
    //пробую привести входной параметр к int, если не получается возвращаю false
    try {
       int param1 = Integer.parseInt(params[0]);
        return true;
    } catch (NumberFormatException e) {
       return false;
    }

}
}

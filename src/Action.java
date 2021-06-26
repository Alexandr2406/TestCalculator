public class Action {

    private ServiceClass serviceClass = new ServiceClass();
    private Delimetr delimetr = new Delimetr();
    private Multiplication multiplication = new Multiplication();
    private Substraction substraction = new Substraction();
    private Sum sum = new Sum();

    public void doAction(String action) {
        //проверяю введёные параметры
        if (!serviceClass.checkParams(serviceClass.params(action)))
            throw new ArithmeticException("не верно введены параметры");

        //если числа римские
        if (!serviceClass.checkArabArray(serviceClass.params(action))) {
            switch (serviceClass.getOperator(action)){
                case "+":
                    System.out.println(sum.romanResult(serviceClass.params(action)[0],
                            serviceClass.params(action)[1]));
                    break;
                case "-":
                    System.out.println(substraction.romanResult(serviceClass.params(action)[0],
                            serviceClass.params(action)[1]));
                    break;
                case "/":
                    System.out.println(delimetr.romaResult(serviceClass.params(action)[0],
                            serviceClass.params(action)[1]));
                    break;
                case "*":
                    System.out.println(multiplication.romanResult(serviceClass.params(action)[0],
                            serviceClass.params(action)[1]));
                    break;
            }

        }
        //если числа арабские, то
        if (serviceClass.checkArabArray(serviceClass.params(action))) {
            switch (serviceClass.getOperator(action)) {
                case "+":
                    System.out.println(sum.showResult(Integer.parseInt(serviceClass.params(action)[0]),
                            Integer.parseInt(serviceClass.params(action)[1])));
                    break;
                case "-":
                    System.out.println(substraction.showResult(Integer.parseInt(serviceClass.params(action)[0]),
                            Integer.parseInt(serviceClass.params(action)[1])));
                    break;
                case "/":
                    System.out.println(delimetr.showResult(Integer.parseInt(serviceClass.params(action)[0]),
                            Integer.parseInt(serviceClass.params(action)[1])));
                    break;
                case "*":
                    System.out.println(multiplication.showResult(Integer.parseInt(serviceClass.params(action)[0]),
                            Integer.parseInt(serviceClass.params(action)[1])));
                    break;
            }
        }


    }
}
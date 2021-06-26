

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Delimetr extends Computation {

    public float showResult(int a, int b){
        if (a<1||a>10||b<1||b>10){throw new ArithmeticException("параметры введены не в допуске условия задачи.");}
        float res= (float) a/b;
        //округляю, чтобы читалось удобнее
        res= new BigDecimal(res).setScale(2, RoundingMode.HALF_UP).floatValue();
        return res;
    }

    public String romaResult(String a,String b){
    float res=this.showResult(Converter.toArab(a),Converter.toArab(b));
    //разбиваю на целые и десятичные числа
        int fist=(int)res;
        //завожу строку, чтобы парсить
        String numString = res+"";
        //выбираю числа после точки
        int second=Integer.parseInt(numString.substring(numString.indexOf('.')+1));
        if (fist==0)return (fist+"."+Converter.roman(second));
        return (Converter.roman(fist)+"."+Converter.roman(second));
    }

}

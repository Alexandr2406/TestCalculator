
public class Delimetr extends Computation {

    public int showResult(int a, int b){
        if (a<1||a>10||b<1||b>10){throw new ArithmeticException("параметры введены не в допуске условия задачи.");}
        return a/b;
    }

    public String romaResult(String a,String b){
        int res= (int) this.showResult(Converter.toArab(a), Converter.toArab(b));
        return Converter.roman(res);
    }

}

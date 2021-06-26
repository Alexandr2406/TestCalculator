public class Substraction extends Computation implements  RomanAction {

    public int showResult(int a,int b){
        if (a<1||a>10||b<1||b>10){throw new ArithmeticException("параметры введены не в допуске условия задачи.");}
        return a-b;
    }

    @Override
    public String romanResult(String a, String b) {
        int res=this.showResult(Converter.toArab(a),Converter.toArab(b));
        if(res<0) return ("-"+Converter.roman(Math.abs(res)));
        return Converter.roman(res);
    }
}

package code.main.Math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> a = new ArrayList<String>();
        for(int i=1;i<=n;i++){
            a.add((i%3==0)?(i%5==0?"FizzBuzz":"Fizz"):(i%5==0?"Buzz":String.valueOf(i)));
        }
        return a;
    }
}

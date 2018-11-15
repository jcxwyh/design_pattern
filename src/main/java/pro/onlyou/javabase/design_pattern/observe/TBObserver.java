package pro.onlyou.javabase.design_pattern.observe;

import java.util.Observable;
import java.util.Observer;

public class TBObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o + " TB接收到新发布的 ： " + arg);
    }

    @Override
    public String toString() {
        return "TB";
    }
}

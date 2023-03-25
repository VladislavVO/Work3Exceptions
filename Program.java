import src.Presenter.Presenter;
import src.View.ConsoleView;
import src.View.View;

public class Program {
    public static void main(String[] args) {
        Presenter<View> prog = new Presenter<View>(new ConsoleView());
        prog.start();
    }
}

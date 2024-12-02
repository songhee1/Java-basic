package testCode.anonymous;

public class AnonymousSample {

    public static void main(String[] args) {
        AnonymousSample sample = new AnonymousSample();
        sample.setButtonListener();
        System.out.println("===");
        sample.setButtonListenerAnonymous();
    }
    public void setButtonListener(){
        MagicButton button = new MagicButton();
        button.setListener(new MagicButtonListener()); // inner class 사용
        button.onClickProcess();
    }
    public void setButtonListenerAnonymous(){
        MagicButton button = new MagicButton();
        button.setListener(() -> System.out.println("Magic Button clicked")); // anonymous class 사용
        // = new EventListener() { System.out.println("Magic Button clicked"); }
        button.onClickProcess();
    }
    public void setButtonListenerAnonymousObject(){
        MagicButton button = new MagicButton();
        EventListener listener = () -> System.out.println("Magic Button clicked"); // anonymous class
        button.setListener(listener); // 객체 재사용
        button.onClickProcess();
    }
}

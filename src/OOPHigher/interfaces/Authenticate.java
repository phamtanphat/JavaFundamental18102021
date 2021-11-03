package OOPHigher.interfaces;

public class Authenticate implements OnLogin{

    public void handleLogin(String userName , String password){
        inputData(userName,password);
        validateForm(userName,password);
    }

    @Override
    public void inputData(String username, String password) {
        if (username.isEmpty() || password.isEmpty()){
            System.out.println("Empty");
            return;
        }
        System.out.println("Input success");
    }

    @Override
    public void validateForm(String username, String password) {
        if (username.length() >= 6 && password.length() >= 6){
            loginSuccess();
        }else{
            loginFail();
        }
    }

    @Override
    public void loginSuccess() {
        System.out.println("Login success");
    }

    @Override
    public void loginFail() {
        System.out.println("Login Fail");
    }
}

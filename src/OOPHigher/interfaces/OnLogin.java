package OOPHigher.interfaces;

public interface OnLogin {
    // abstract function : phuong thức trượu tương
    void inputData(String username , String password);
    void validateForm(String username , String password);
    void loginSuccess();
    void loginFail();
}

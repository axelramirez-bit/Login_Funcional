
package main;

import View.Login.LoginFrame;

public class Main {

    public static void main(String[] args) {

        LoginFrame login
                = new LoginFrame();

        login.pack();

        login.setLocationRelativeTo(null);

        login.setVisible(true);

    }

}

package io.std.turnero;

import io.std.turnero.igu.Principal;

/**
 * @author DEV sprout
 */
public class Turnero {

  public static void main(String[] args) {
    Principal principal = new Principal();
    principal.setResizable(false);
    principal.setTitle("Turnero");
    principal.setVisible(true);
    principal.setLocationRelativeTo(null);
  }
}

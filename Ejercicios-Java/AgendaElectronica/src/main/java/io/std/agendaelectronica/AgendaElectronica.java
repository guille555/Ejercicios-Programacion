package io.std.agendaelectronica;

import io.std.agendaelectronica.igu.Principal;

public class AgendaElectronica {

  public static void main(String[] args) {
    Principal principal = new Principal();
    principal.setVisible(true);
    principal.setResizable(false);
    principal.setTitle("Agenda Electrónica");
    principal.setLocationRelativeTo(null);
  }
}

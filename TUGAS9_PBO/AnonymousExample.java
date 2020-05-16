
/**
 * nama : APRIANI MAGFIRA 
 * Kelas : B1
 * tanggal/ waktu : jumat, 15 mei 2020, 22.51
 */

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

class AnonymousExample {
  public static void main(String args[]) {
    Frame frame = new Frame("AnonymousEventExample");
    Button button = new Button("A");
    Panel p = new Panel();
    p.add(button);
    frame.add(button, BorderLayout.NORTH);
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent event) {
        String choice = event.getActionCommand();
        JOptionPane.showMessageDialog(null, "You have clicked: "
            + choice);
      }
    });
    frame.pack();
    frame.setVisible(true);
    frame.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
}

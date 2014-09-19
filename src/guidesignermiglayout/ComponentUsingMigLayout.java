
package guidesignermiglayout;

import net.miginfocom.layout.CC;
import net.miginfocom.layout.LC;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class ComponentUsingMigLayout extends JPanel {
   public ComponentUsingMigLayout() {
      try {
         setLayout(new MigLayout(new LC().insets("20")));
         add(new JButton("Hello"), new CC().cell(0, 0));
      }
      catch (Throwable t) {
         JOptionPane.showMessageDialog(null, t.toString());
      }
   }
}

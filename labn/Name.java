
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Name {
    public static void main(String[] args) throws Exception {
       JFrame frame = new JFrame("Menu");
       frame.setSize(400,400);
       frame.setVisible(true);

       JPanel mainPanel = new JPanel();
       frame.add(mainPanel);

       GridBagLayout gridBagLayout = new GridBagLayout();
       mainPanel.setLayout(gridBagLayout);

       JLabel firstNameLabel = new JLabel("First Name");
        JLabel lastNameLabel = new JLabel("Last Name");

        JTextField firstNameTextField = new JTextField(15);
        JTextField lastNameTextField = new JTextField(15);

        JButton button = new JButton("FULL NAME");
       GridBagConstraints gridBagConstraints = new GridBagConstraints();


       gridBagConstraints.gridx = 0;
       gridBagConstraints.gridy = 0;
       mainPanel.add(firstNameLabel,gridBagConstraints);

         gridBagConstraints.gridx = 1;
       gridBagConstraints.gridy = 0;
       mainPanel.add(firstNameTextField,gridBagConstraints);

       gridBagConstraints.gridx = 0;
       gridBagConstraints.gridy = 1;
       mainPanel.add(lastNameLabel,gridBagConstraints);

         gridBagConstraints.gridx = 1;
       gridBagConstraints.gridy = 1;
       mainPanel.add(lastNameTextField,gridBagConstraints);

    }
}
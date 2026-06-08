import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class abc {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Menu");
        frame.setSize(400,400);
        frame.setVisible(true);

        JPanel mainPanel= new JPanel();
        frame.add(mainPanel);

        GridBagLayout gridBagLayout = new GridBagLayout();
        mainPanel.setLayout(gridBagLayout);

        JLabel firstNameLabel = new JLabel("First Name:");
        JLabel lastNameLabel = new JLabel("Last Name:");

        JTextField firstNameTextField = new JTextField(15);
        JTextField lastNameTextField = new JTextField(15);

        JButton button = new JButton("Full name");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        mainPanel.add(firstNameLabel, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        mainPanel.add(firstNameTextField, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        mainPanel.add(lastNameLabel, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        mainPanel.add(lastNameTextField, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        mainPanel.add(button, gridBagConstraints);

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            String firstName = firstNameTextField.getText();
            String lastName = lastNameTextField.getText();


            if(firstName.isEmpty() || lastName.isEmpty()){
                JOptionPane.showMessageDialog(mainPanel, "Please insert name","Empty Name", 0);
              } else {
                JOptionPane.showMessageDialog(mainPanel, "Full Name Hello " + firstName + " " + lastName, "Name", 0);
            }

        }
        });

    }
}
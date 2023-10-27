import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame {

    private JTextField nameField;
    private Choice departmentChoice;
    private JTextField mobileField;
    private JCheckBox maleCheckBox;
    private JCheckBox femaleCheckBox;
    private JTextArea aboutTextArea;
    private JButton submitButton;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);

        JLabel departmentLabel = new JLabel("Department:");
        departmentChoice = new Choice();
        departmentChoice.add("Select Department");
        departmentChoice.add("HR");
        departmentChoice.add("IT");
        departmentChoice.add("Finance");
        departmentChoice.add("Sales");

        JLabel mobileLabel = new JLabel("Mobile Number:");
        mobileField = new JTextField(20);

        JLabel genderLabel = new JLabel("Gender:");
        maleCheckBox = new JCheckBox("Male");
        femaleCheckBox = new JCheckBox("Female");

        JLabel aboutLabel = new JLabel("About Yourself:");
        aboutTextArea = new JTextArea(4, 20);
        aboutTextArea.setLineWrap(true);

        submitButton = new JButton("SUBMIT");

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(departmentLabel);
        panel.add(departmentChoice);
        panel.add(mobileLabel);
        panel.add(mobileField);
        panel.add(genderLabel);
        panel.add(maleCheckBox);
        panel.add(new JLabel()); // Empty space
        panel.add(femaleCheckBox);
        panel.add(aboutLabel);
        panel.add(new JScrollPane(aboutTextArea));
        add(panel, BorderLayout.CENTER);
        add(submitButton, BorderLayout.SOUTH);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String department = departmentChoice.getSelectedItem();
                if (name.isEmpty() || department.equals("Select Department")) {
                    JOptionPane.showMessageDialog(null, "Please fill in all fields.");
                } else {
                    String gender = maleCheckBox.isSelected() ? "Male" : "Female";
                    String message = "Welcome " + name + ", to the " + department + ".\n";
                    message += "Gender: " + gender + "\n";
                    message += "Mobile Number: " + mobileField.getText() + "\n";
                    message += "About Yourself: " + aboutTextArea.getText();
                    JOptionPane.showMessageDialog(null, message);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RegistrationForm registrationForm = new RegistrationForm();
            registrationForm.setVisible(true);
        });
    }
}

//create a newapaper coverpage using different layout managers
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class NewspaperCoverPage extends JFrame {

    public NewspaperCoverPage() {
        setTitle("Daily Times - Newspaper Cover Page");
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main container
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        // ================= HEADER =================
        JPanel headerPanel = new JPanel(new BorderLayout());

        JLabel title = new JLabel("THE DAILY TIMES", SwingConstants.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 36));

        JLabel date = new JLabel("Tuesday, May 26, 2026", SwingConstants.RIGHT);
        date.setFont(new Font("Arial", Font.PLAIN, 14));

        headerPanel.add(title, BorderLayout.CENTER);
        headerPanel.add(date, BorderLayout.SOUTH);

        // ================= MAIN NEWS =================
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(1, 2, 15, 15));

        // Left column
        JPanel leftNews = new JPanel();
        leftNews.setLayout(new BoxLayout(leftNews, BoxLayout.Y_AXIS));
        leftNews.setBorder(new TitledBorder("Top Stories"));

        JLabel headline1 = new JLabel("Global Tech Conference Opens");
        headline1.setFont(new Font("Arial", Font.BOLD, 22));

        JTextArea story1 = new JTextArea(
                "Thousands gather to discuss the future of AI, robotics, "
                        + "and renewable technologies in a landmark event.");
        story1.setLineWrap(true);
        story1.setWrapStyleWord(true);
        story1.setEditable(false);

        JLabel headline2 = new JLabel("Sports Championship Highlights");
        headline2.setFont(new Font("Arial", Font.BOLD, 18));

        JTextArea story2 = new JTextArea(
                "An exciting finale keeps fans cheering as the underdogs "
                        + "claim a historic victory.");
        story2.setLineWrap(true);
        story2.setWrapStyleWord(true);
        story2.setEditable(false);

        leftNews.add(headline1);
        leftNews.add(Box.createVerticalStrut(10));
        leftNews.add(story1);
        leftNews.add(Box.createVerticalStrut(20));
        leftNews.add(headline2);
        leftNews.add(Box.createVerticalStrut(10));
        leftNews.add(story2);

        // Right column
        JPanel rightNews = new JPanel(new BorderLayout());
        rightNews.setBorder(new TitledBorder("Featured Article"));

        JLabel featuredTitle = new JLabel(
                "<html><h1>City Introduces Smart Transport System</h1></html>");

        JTextArea featuredText = new JTextArea(
                "The new transport initiative aims to reduce traffic congestion "
                        + "and improve sustainability through AI-powered systems.");
        featuredText.setLineWrap(true);
        featuredText.setWrapStyleWord(true);
        featuredText.setEditable(false);

        rightNews.add(featuredTitle, BorderLayout.NORTH);
        rightNews.add(featuredText, BorderLayout.CENTER);

        centerPanel.add(leftNews);
        centerPanel.add(rightNews);

        // ================= FOOTER =================
        JPanel footerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel footer = new JLabel(
                "Weather: Sunny 28°C | www.dailytimes.com | Price: $2");
        footer.setFont(new Font("Arial", Font.ITALIC, 14));

        footerPanel.add(footer);

        // ================= ADD TO MAIN PANEL =================
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(footerPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NewspaperCoverPage page = new NewspaperCoverPage();
            page.setVisible(true);
        });
    }
}
import java.awt.Color;
import Image.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
class ChatBot extends JFrame
{
	private ImageBackground Chatarea = new ImageBackground();
	private JTextField Userarea = new JTextField();
	private JButton button = new JButton();
	private JButton file = new JButton();
	private JLabel l = new JLabel();
	private JLabel T = new JLabel();
	public FileWriter WriteFile;
	
	
	ChatBot()//CONSTRUCTOR
	{
		//WINDOW DESIGN
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setResizable(true);
		f.setLayout(null);
		f.setSize(400, 400);
		f.getContentPane().setBackground(Color.BLACK);
		f.setTitle("FARMERS ChatBot");
		f.add(Chatarea);
		f.add(Userarea);
		
		//CHAT AREA DESIGN
		Chatarea.setSize(1300, 610);
		Chatarea.setLocation(2, 2);
		Chatarea.setBackground(Color.BLACK);
		Chatarea.setFont(new Font("COPPER BLACK", Font.BOLD, 16));
		ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("robot.jpg"));
		Chatarea.setImage(icon);
		Chatarea.setText("WELCOME TO FARMERS CHATBOT TYPE HI TO START"+"\n");
		Chatarea.setForeground(Color.WHITE);
		Userarea.setSize(850, 50);
		Userarea.setLocation(2, 620);
		f.add(button);
		l.setText("SEND");
		button.add(l);
		button.setSize(200, 50);
		button.setLocation(900, 620);
		f.add(file);
		T.setText("EXTRACT CHAT");
		file.add(T);
		file.setSize(200, 50);
		file.setLocation(1100, 620);
		
		//ON CLICK OF SEND BUTTON CHATTING PROCESS BEGINS
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{	
				if(e.getSource()==button)
				{
					String input = Userarea.getText().toUpperCase();
					Chatarea.setForeground(Color.WHITE);
					Chatarea.append("You--->"+input +"\n");
					Userarea.setText("");
					
					
					if(input.contains("HI"))
					{
						Bot("HELLO....WHAT IS YOUR NAME");
					}
					else if(input.contains("MY"))
					{
						Bot("THATS A NICE NAME :) HOW CAN I HELP YOU..");
					}
					else if(input.contains("CROP"))
					{
						Bot("TYPE WHAT YOU NEED INFORMATION ON THAT CROP IS IT ABOUT");
						Bot("FERTILIZERS");
						Bot("PESTICIDE");
						Bot("IRRIGATION");
						Bot("OTHERS");
					}
					else if(input.contains("FERTILIZERS"))
					{
						Bot("NPK 14-15 IS THE BEST ORGANIC FERTILIZER YOU CAN USE FOR MAJORITY OF CROPS");
						Bot("ASK ANYTHING ELSE OR TYPE BYE TO EXIT");
					}
					else if(input.contains("PEST"))
					{
						Bot("ON A GENERAL NOTE USE SALTWATER AND RINSE THE CROP 3 TIMES A DAY");
						Bot("OR IF YOU CAN  DESCRIBE ITS LOOK FOR EXAMPLE COLOR, SIZE I WILL FIND THE PEST");
					}
					else if(input.contains("YELLOW"))
					{
						Bot("OH..ITS THRIPS BUG...YOU CAN USE KILLTHRIPS 265 TO CONTROL IT");
						Bot("ASK ANYTHING ELSE OR TYPE BYE TO EXIT");
					}
					else if(input.contains("SMALL"))
					{
						Bot("OH..ITS BITECST BUG...YOU CAN USE POSPOROUS342 TO CONTROL IT");
						Bot("ASK ANYTHING ELSE OR TYPE BYE TO EXIT");
					}
					else if(input.contains("BIG"))
					{
						Bot("OH..ITS APHID BUG...USE PESTCOM445 TO CONTROL IT");
						Bot("ASK ANYTHING ELSE OR TYPE BYE TO EXIT");
					}
					else if(input.contains("RED"))
					{
						Bot("OH..ITS MEALY BUG...USE KILLMEALY 265 TO CONTROL IT");
						Bot("ASK ANYTHING ELSE OR TYPE BYE TO EXIT");
					}
					else if(input.contains("IRRIGATION"))
					{
						Bot("USE IOT BASED IRRIGATION SYSTEM TO MAKE YOUR JOB EASY AND EFFECINTLY MANAGE WATER RESOURCE");
						Bot("ASK ANYTHING ELSE OR TYPE BYE TO EXIT");
					}
					else if(input.contains("OTHERS"))
					{
						Bot("HOW CAN I HELP YOU");
					}
					else if(input.contains("SEEDS"))
					{
						Bot("BUY BEST QUALITY SEEDS FROM BMSCE AGRO MARKET");
					}
					else if(input.contains("SUMMER"))
					{
						Bot("YOU CAN GROW RAGI TOMATOES CUCUMBER BELL PEPPER IN HOT SUMMER WEATHER");
					}	
					else if(input.contains("RAINY"))
					{
						Bot("YOU CAN GROW MAIZE TOMATOES CHILLY BRINJAL IN RAIN WEATHER");
					}
					else if(input.contains("WINTER"))
					{
						Bot("YOU CAN GROW CORN ONION GARLIC PEAS IN COLD WEATHER");
					}
					else if(input.contains("BYE"))
					{
						Bot("CLICK ON EXTRACT CHAT TO SAVE A COPY OF OUR CHAT...:-)");
						Bot("THANK YOU GO GREEN SAVE WATER SUPPORT FARMERS");
					}
					else
					{
						int rand = (int)(Math.random()* 3 +1);
						if(rand == 1)
						{
							Bot("THE INFORMATION YOU ASKED CANNOT BE FETCHED ASK ANYTHING ELSE OR TYPE BYE TO EXIT");
						}
						if(rand == 2)
						{
							Bot("TYPE HI TO START CONVERSATION OR EXIT");
						}
					}
					
				}
			}
		});
		
		//EXTRACTING THE CHAT TO A FILE
		
		file.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent extract)
			{
				if(extract.getActionCommand()==file.getActionCommand())
				{
					try
					{
						WriteFile = new FileWriter("H:/OUTPUT SHEET.txt");
						WriteFile.write(Chatarea.getText());
						WriteFile.close();
						JOptionPane.showMessageDialog(null,"CHAT SUCCESSFULLY SAVED ON OUTPUT SHEET TEXT FILE");
					}
					catch(Exception e) {
						JOptionPane.showMessageDialog(null, e +"");
					}
					
				}
			}
				
		});
		
	}

	//CHATBOT RESPONSE METHOD
	
	public  void Bot(String res)
	{
		Chatarea.append("ChatBot--->"+res+"\n");
	}
}

public class FarmerChatBot
{

	public static void main(String[] args) 
	{
		new ChatBot();

	}

}

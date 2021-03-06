import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class KakaoFriends extends JPanel
{
	//panel4
	public JPanel controlPanel;
	public JButton listButton, exit;
	public JLabel title, titleTalk, titleKakao;
	public DefaultListModel listModel;
	public JList friendList;
	public JScrollPane scrollPane;
	public KakaoFriends()
	{
		//card4
		controlPanel = new JPanel();
		titleKakao = new JLabel("Kakao");
		titleTalk = new JLabel("Talk");
		ImageIcon list = new ImageIcon("list.png");
		Image resizedList = list.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		listButton = new JButton("���",new ImageIcon(resizedList)); 
		title = new JLabel("ģ�����");
		listModel = new DefaultListModel();
		friendList = new JList(listModel);
		scrollPane = new JScrollPane(friendList);
		exit = new JButton("X");;

		setLayout(null);
		controlPanel.setLayout(null);
		controlPanel.add(title);
		controlPanel.add(titleKakao);
		controlPanel.add(titleTalk);
		controlPanel.add(listButton);
		controlPanel.add(exit); 

		controlPanel.setBounds(0, 0, 350, 100);
		controlPanel.setBackground(new Color(69,44,42));
		
		titleKakao.setBounds(10 ,3 ,70, 30);
		titleKakao.setForeground(new Color(255,255,255));
		titleKakao.setFont(new Font("���� ����",Font.PLAIN,20));
		titleTalk.setBounds(65 ,3 ,70, 30);
		titleTalk.setForeground(new Color(255,255,255));
		titleTalk.setFont(new Font("���� ����",Font.BOLD,20));

		title.setBounds(135, 50, 100, 50);
		title.setForeground(new Color(255,255,255));
		title.setFont(new Font("���� ����",Font.BOLD,20));
		
		listButton.setBackground(new Color(69,44,42));
		listButton.setBounds(280, 50, 50, 50);
		listButton.setBorder(null);
		listButton.setFocusPainted(false);
		scrollPane.setBounds(0, 100, 350, 500);

		exit.setBackground(new Color(69,44,42));
		exit.setFont(new Font("���� ����",Font.BOLD,12));
		exit.setForeground(new Color(255,255,255));
		exit.setBorder(null);
		exit.setFocusPainted(false);
		exit.setBounds(330,5, 20, 20);
		//exit.addActionListener(new )

		listModel.addElement("f1");	 listModel.addElement("g2");
		listModel.addElement("f2");	 listModel.addElement("g3 g3");
		listModel.addElement("f4");	 listModel.addElement("g4");
		listModel.addElement("g5");
		
		friendList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		add(controlPanel);
		add(scrollPane);
	}

}

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
import java.io.*;

public class KakaoClient extends UnicastRemoteObject implements KakaoClientInterface {
	
	private KakaoTalk frame = null;
	private KakaoServerInterface server = null;

	public KakaoClient() throws RemoteException {}

	public KakaoClient(KakaoTalk frame, String name, String talkName) throws RemoteException, MalformedURLException, NotBoundException {
		this.frame = frame;
		server = ( KakaoServerInterface )Naming.lookup( "rmi://127.0.0.1/kakao" );
		server.setClient(this,  name,  talkName); // ������ ���� ���
	}
	public KakaoServerInterface getServer() {
		return server;
	}

	// ������ �޽��� �ޱ�(�޽���)
	public void setMessage( String msg ) throws RemoteException {
		System.out.println( msg );
		frame.chatView.textArea.append(msg +"\n");
	}
	
	// ������ ������ ��� �޾ƿ���
	public void getConnectedUser() throws RemoteException {
	}

	// �� �����ϱ�(������, ��������)
	public void makeRoom( String roomName, ArrayList<Integer> invitedUserList ) throws RemoteException {
	}

	// �� ������
	public void exitRoom(  User user ) throws RemoteException {
	}
}




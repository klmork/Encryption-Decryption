
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 * Encrypts and Decrypts text using the Caesar Cihper algorithm.
 * @author Invisible Computer, JTN
 *
 */
public class CaesarGUI extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private static String ascii = "abcde";
    //private static String ascii = "abc%de0f g98h$6i7j\\12!kl\"m3:;.4n#-5o?'p,=|qr&/@^`<~(s>t)_{u*v[+w}]xyz";  //CHANGE ascii
    private JTextField shiftFactor;
    private JTextArea inputTA;
    private JTextArea outputTA;
    private int asciiLength = ascii.length();


    /**
     * @param args
     */
    public static void main(String[] args) {
        new CaesarGUI().setVisible(true);
    }
    
    public void encryptText1() throws InterruptedException {
        //Create a HashMap
        //A hash map takes keys and values, which are both Characters in this case.
        HashMap<Character, Character> alphaMap = new HashMap<Character, Character>();
        int shift;
        //Get the text from the app and store it in a String variable.
        String textNum = this.shiftFactor.getText();
        //Check to see if a "Shift Factor" value was entered.
        //If there wasn't, set shift to zero,
        //Otherwise parse the input value to an integer so we can use it.
        if(!textNum.equals("")){
            shift = Integer.parseInt(textNum)%asciiLength;  //CHANGE TO MOD HOWEVER
        }
        else{
            shift = 0;
        }
        //Map every letter of the ascii to another letter in the ascii, shifted by x places.
        for(int i=0; i<ascii.length(); i++){
           for(int j=0; j<ascii.length(); j++)
           {
           alphaMap.put(ascii.charAt(i), ascii.charAt((i+shift + j)%ascii.length()));
          }
        }
        
        //Get input text and put it all to lower-case so it's easy to convert
        String inputText = inputTA.getText().toLowerCase();  //GET TEXT
        String outputText = "";
        //Go to each letter and switch it with it's shifted counterpart
        for(int j=0; j<inputText.length(); j++){
           
            outputText = outputText.concat(alphaMap.get(inputText.charAt(j)).toString());

        }
        //Output the encrypted text
        outputTA.setText(outputText);
    }
    
    public void decryptText1() throws InterruptedException{
        HashMap<Character, Character> alphaMap = new HashMap<Character, Character>();
        int shift;
        String textNum = this.shiftFactor.getText();
        if(!textNum.equals("")){
            shift = Integer.parseInt(textNum)%asciiLength;
        }
        else{
            shift = 0;
        }
        for(int i=0; i<ascii.length(); i++){
            for (int j=0; j<ascii.length(); j++)
            {
            alphaMap.put(ascii.charAt((i+shift + j)%asciiLength), ascii.charAt(i));
        }
        }
        String inputText = inputTA.getText().toLowerCase();
        String outputText = "";
        for(int j=0; j<inputText.length(); j++){
            outputText = outputText.concat(alphaMap.get(inputText.charAt(j)).toString());
        }
        outputTA.setText(outputText);
    }
    
    public void encryptText2() throws InterruptedException {
        //Create a HashMap
        //A hash map takes keys and values, which are both Characters in this case.
        HashMap<Character, Character> alphaMap = new HashMap<Character, Character>();
        int shift;
        //Get the text from the app and store it in a String variable.
        String textNum = this.shiftFactor.getText();
        //Check to see if a "Shift Factor" value was entered.
        //If there wasn't, set shift to zero,
        //Otherwise parse the input value to an integer so we can use it.
        if(!textNum.equals("")){
            shift = Integer.parseInt(textNum)%asciiLength;  //CHANGE TO MOD HOWEVER
        }
        else{
            shift = 0;
        }
        //Map every letter of the ascii to another letter in the ascii, shifted by x places.
       
        for(int i=0; i<ascii.length(); i++){
            if (i%2 == 0)
            {
              alphaMap.put(ascii.charAt(i), ascii.charAt(Math.abs((i-shift))%asciiLength));
            }
            else
            {
                alphaMap.put(ascii.charAt(i), ascii.charAt((i+shift)%asciiLength));
            }
        }
    
        
        //Get input text and put it all to lower-case so it's easy to convert
        String inputText = inputTA.getText().toLowerCase();  //GET TEXT
        String outputText = "";
        //Go to each letter and switch it with it's shifted counterpart
        for(int j=0; j<inputText.length(); j++){
            outputText = outputText.concat(alphaMap.get(inputText.charAt(j)).toString());
        }
        //Output the encrypted text
        outputTA.setText(outputText);
    }
    
    public void decryptText2() throws InterruptedException{
        HashMap<Character, Character> alphaMap = new HashMap<Character, Character>();
        int shift;
        String textNum = this.shiftFactor.getText();
        if(!textNum.equals("")){
            shift = Integer.parseInt(textNum)%asciiLength;
        }
        else{
            shift = 0;
        }
        
        
        for(int i=0; i<ascii.length(); i++){
            if(i%2 == 0)
            {
              alphaMap.put(ascii.charAt((i+shift)%asciiLength), ascii.charAt(i));
            }
            else
            {
                alphaMap.put(ascii.charAt((Math.abs(i-shift))%asciiLength), ascii.charAt(i));
            }
        }
        String inputText = inputTA.getText().toLowerCase();
        String outputText = "";
        for(int j=0; j<inputText.length(); j++){
            outputText = outputText.concat(alphaMap.get(inputText.charAt(j)).toString());
        }
        outputTA.setText(outputText);
    }
    
    public void encryptText3() throws InterruptedException {
        //Create a HashMap
        //A hash map takes keys and values, which are both Characters in this case.
        HashMap<Character, Character> alphaMap = new HashMap<Character, Character>();
        int shift;
        //Get the text from the app and store it in a String variable.
        String textNum = this.shiftFactor.getText();
        //Check to see if a "Shift Factor" value was entered.
        //If there wasn't, set shift to zero,
        //Otherwise parse the input value to an integer so we can use it.
        if(!textNum.equals("")){
            shift = Integer.parseInt(textNum)%asciiLength;  //CHANGE TO MOD HOWEVER
        }
        else{
            shift = 0;
        }
        //Map every letter of the ascii to another letter in the ascii, shifted by x places.
        for(int i=0; i<ascii.length(); i++){
            alphaMap.put(ascii.charAt(i), ascii.charAt((i+shift)%asciiLength));
        }
        
        //Get input text and put it all to lower-case so it's easy to convert
        String inputText = inputTA.getText().toLowerCase();  //GET TEXT
        String outputText = "";
        //Go to each letter and switch it with it's shifted counterpart
        for(int j=0; j<inputText.length(); j++){
            outputText = outputText.concat(alphaMap.get(inputText.charAt(j)).toString());
        }
        //Output the encrypted text
        outputTA.setText(outputText);
    }
    
    public void decryptText3() throws InterruptedException{
        HashMap<Character, Character> alphaMap = new HashMap<Character, Character>();
        int shift;
        String textNum = this.shiftFactor.getText();
        if(!textNum.equals("")){
            shift = Integer.parseInt(textNum)%asciiLength;
        }
        else{
            shift = 0;
        }
        for(int i=0; i<ascii.length(); i++){
            alphaMap.put(ascii.charAt((i+shift)%asciiLength), ascii.charAt(i));
        }
        String inputText = inputTA.getText().toLowerCase();
        String outputText = "";
        for(int j=0; j<inputText.length(); j++){
            outputText = outputText.concat(alphaMap.get(inputText.charAt(j)).toString());
        }
        outputTA.setText(outputText);
    }
    public CaesarGUI(){
        setTitle("Caesar Cipher");
        setVisible(true);
        setDefaultCloseOperation(3);

        Container content = getContentPane();
        GridLayout layout = new GridLayout(3, 0, 0, 10);
        content.setLayout(layout);

        inputTA = new JTextArea("Insert the text to be encrypted/decrypted here, then press the appropriate button.", 12, 40);
        inputTA.setLineWrap(true);
        inputTA.setWrapStyleWord(true);
        inputTA.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        JScrollPane scroller = new JScrollPane(inputTA);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        content.add(scroller);
        
        outputTA = new JTextArea("Output text.",12, 40);
        outputTA.setLineWrap(true);
        outputTA.setWrapStyleWord(true);
        outputTA.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        JScrollPane scroller2 = new JScrollPane(outputTA);
        scroller2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        content.add(scroller2);
        
        JPanel box1 = new JPanel();
        box1.setLayout(new FlowLayout());
        JButton decryptButton1 = new JButton("Decrypt1");
        JButton encryptButton1 = new JButton("Encrypt1");
        JButton decryptButton2 = new JButton("Decrypt2");
        JButton encryptButton2 = new JButton("Encrypt2");
        JButton decryptButton3 = new JButton("Decrypt3");
        JButton encryptButton3 = new JButton("Encrypt3");
        decryptButton1.addActionListener(this);
        encryptButton1.addActionListener(this);
        decryptButton2.addActionListener(this);
        encryptButton2.addActionListener(this);
        decryptButton3.addActionListener(this);
        encryptButton3.addActionListener(this);
        box1.add(decryptButton1);
        box1.add(encryptButton1);
        box1.add(decryptButton2);
        box1.add(encryptButton2);
        box1.add(decryptButton3);
        box1.add(encryptButton3);
        box1.add(new JLabel("Shift Factor"));
        box1.add(this.shiftFactor = new JTextField(20));
        content.add(box1);
        
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Encrypt1")){
            try{
                encryptText1();
            }
            catch(InterruptedException e1){
                e1.printStackTrace();
            }
        }
        if (e.getActionCommand().equals("Decrypt1"))
              try {
                decryptText1();
              } catch (InterruptedException e1) {
                e1.printStackTrace();
              }
              
              if(e.getActionCommand().equals("Encrypt2")){
            try{
                encryptText2();
            }
            catch(InterruptedException e1){
                e1.printStackTrace();
            }
        }
        if (e.getActionCommand().equals("Decrypt2"))
              try {
                decryptText2();
              } catch (InterruptedException e1) {
                e1.printStackTrace();
              }
              
              if(e.getActionCommand().equals("Encrypt3")){
            try{
                encryptText3();
            }
            catch(InterruptedException e1){
                e1.printStackTrace();
            }
        }
        if (e.getActionCommand().equals("Decrypt3"))
		      try {
		        decryptText3();
		      } catch (InterruptedException e1) {
		        e1.printStackTrace();
		      }
	}
}
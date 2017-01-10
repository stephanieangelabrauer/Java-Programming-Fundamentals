/**
  This is a simple GUI Camera simulator.
*/
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class CameraGUI extends JFrame {
  private Camera2 cam = new Camera2();

	private final String WINDOW_TITLE = "Camera GUI";
	private final int WINDOW_WIDTH = 900;
	private final int WINDOW_HEIGHT = 170;

	// The following named controls will appear in our GUI
  private JPanel controlPanel = new JPanel();
  private JLabel powerLabel = new JLabel();
  private JLabel flashLabel = new JLabel();
  private JLabel colorstrengthLabel  = new JLabel();
	private JLabel brightnessLabel  = new JLabel();	
  private JLabel volumeLabel = new JLabel();
  private JButton powerButton = new JButton("Power");
  private JButton flashButton = new JButton("Flash");
  private JSlider colorstrengthSlider = new JSlider(JSlider.HORIZONTAL, 1, 7, 4);	
  private JSlider brightnessSlider = new JSlider(JSlider.HORIZONTAL, 1, 7, 4);		
  private JSlider volumeSlider = new JSlider(JSlider.HORIZONTAL, 0, 6, 3);
  private JButton exitButton = new JButton("Exit");

  /**
    The main method creates an instance of the
    CameraGUI class, which displays
    its window on the screen.
  */
    public static void main(String[] args) {
        new CameraGUI();
    }
	/**
	 The constructor for this application will initialize the JFrame
	 by setting the window title bar, giving the frame a size,
	 initializing all the controls that appear on the frame, and
	 then make it visible.
	*/
    public CameraGUI() {
        setTitle(WINDOW_TITLE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildControlPanel();
        add(new JLabel("A Simple Camera GUI",SwingConstants.CENTER),BorderLayout.NORTH);
        add(controlPanel,BorderLayout.CENTER);
    	  exitButton.addActionListener(new ExitButtonListener());
        add(exitButton,BorderLayout.SOUTH);
        initializePanelValues();
        setVisible(true);
    }
	/**
      The buildControlPanel method creates a panel to hold the GUI components.
   */
   private void buildControlPanel() {
  		colorstrengthSlider.addChangeListener (new CSliderListener());
  		colorstrengthSlider.setMajorTickSpacing(1);
  		colorstrengthSlider.setPaintTicks(true);		
  		colorstrengthSlider.setPaintLabels(true);
  		colorstrengthSlider.setSnapToTicks(true);		
  		brightnessSlider.addChangeListener (new BSliderListener());
  		brightnessSlider.setMajorTickSpacing(1);
  		brightnessSlider.setPaintTicks(true);		
  		brightnessSlider.setPaintLabels(true);
  		brightnessSlider.setSnapToTicks(true);
  		volumeSlider.addChangeListener (new VSliderListener());
  		volumeSlider.setMajorTickSpacing(1);
  		volumeSlider.setPaintTicks(true);		
  		volumeSlider.setPaintLabels(true);
  		volumeSlider.setSnapToTicks(true);		
      controlPanel.setLayout(new FlowLayout());		
      controlPanel.add(new JLabel("Colorstrength: ",SwingConstants.RIGHT));
      controlPanel.add(colorstrengthLabel);
      controlPanel.add(colorstrengthSlider);		
      controlPanel.add(new JLabel("Brightness: ",SwingConstants.RIGHT));
      controlPanel.add(brightnessLabel);
      controlPanel.add(brightnessSlider);		
      controlPanel.add(new JLabel("Volume: ",SwingConstants.RIGHT));
      controlPanel.add(volumeLabel);
      controlPanel.add(volumeSlider);	
      controlPanel.add(new JLabel("Flash: ",SwingConstants.RIGHT));
      controlPanel.add(flashLabel);
  		controlPanel.add(flashButton);
      controlPanel.add(new JLabel("Power: ",SwingConstants.RIGHT));
      controlPanel.add(powerLabel);
      controlPanel.add(powerButton);			
    }

   /**
      The initializePanelValues method sets the values for the fields displayed
      on the controlPanel.
   */
   private void initializePanelValues() {
	   powerLabel.setText(String.valueOf(cam.getPower()));
	   colorstrengthLabel.setText(String.valueOf(cam.getColorstrength()));
	   brightnessLabel.setText(String.valueOf(cam.getBrightness()));
	   volumeLabel.setText(String.valueOf(cam.getVolume()));
	   flashLabel.setText(String.valueOf(cam.getFlash()));	 	   
	   powerButton.addActionListener(new CamButtonListener());
	   flashButton.addActionListener(new CamButtonListener()); 
	   disableButtonAndSliders();
   }

   /**
      The disableButtonAndSliders method disables the flash button and the colorstrength, brightness, and volume sliders.
   */
   private void disableButtonAndSliders() {
		flashButton.setEnabled(false);
		colorstrengthSlider.setEnabled(false);
		brightnessSlider.setEnabled(false);
		volumeSlider.setEnabled(false);
   }

   /**
      The enableButtons method enables the flash button and the colorstrength, brightness, and volume sliders.
   */
   private void enableButtonAndSliders() {
		flashButton.setEnabled(true);
		colorstrengthSlider.setEnabled(true);
		brightnessSlider.setEnabled(true);
		volumeSlider.setEnabled(true);
   }
   
   	/**
      CSliderListener is an action listener class that processes
      the colorstrengthSlider.
   	*/
	private class  CSliderListener  implements ChangeListener {
      /**
        The actionPerformed method executes when the user
         clicks on the colorstrengthSlider.
         @param e The event object.
      */
        public void stateChanged(ChangeEvent e) {
    			String temp = Integer.toString (colorstrengthSlider.getValue());
    			colorstrengthLabel.setText(temp);
    		}
  }
   
   	/**
      BSliderListener is an action listener class that processes
      the brightnessSlider.
   	*/
	private class  BSliderListener  implements ChangeListener {
      /**
         The actionPerformed method executes when the user
         clicks on the brightnessSlider.
         @param e The event object.
      */
      	public void stateChanged(ChangeEvent e)   
		{
			String temp = Integer.toString (brightnessSlider.getValue());
			brightnessLabel.setText(temp);
		}
   }
   
   	/**
      VSliderListener is an action listener class that processes
      the volumeSlider.
   	*/   
   	private class  VSliderListener  implements ChangeListener
   {
      /**
         The actionPerformed method executes when the user
         clicks on the volumeSlider.
         @param e The event object.
      */
		public void stateChanged(ChangeEvent e)   
		{
			String temp = Integer.toString (volumeSlider.getValue());
			volumeLabel.setText(temp);
		}
   } 
   
   	/**
      CameraButtonListener is an action listener class that processes
      all the Camera buttons (power and flash).
   	*/
	private class CamButtonListener implements ActionListener
	{
      /**
         The actionPerformed method executes when the user
         clicks on one of the Camera buttons.
         @param e The event object.
      */
      	public void actionPerformed(ActionEvent e)
		{
        	if (e.getSource()==powerButton)
 			{
 				 cam.togglePower();
 				 powerLabel.setText(String.valueOf(cam.getPower()));
 			}
         	else if (e.getSource()==flashButton)
	 		{
		 		 cam.toggleFlash();
			 	 flashLabel.setText(String.valueOf(cam.getFlash()));
	 		}						
		 	else
		 		 System.err.println("Error");

			// if power is on enable the button and sliders, else disable them.
			if (cam.getPower())
				enableButtonAndSliders();
			else
				disableButtonAndSliders();

		} // End of actionPerformed

   } // End of CameraButtonListener class

   	/**
      ExitButtonListener is an action listener class for
      the Exit button.
   	*/
	private class ExitButtonListener implements ActionListener {
    /**
      The actionPerformed method executes when the user
      clicks on the Exit button.
      @param e The event object.
    */
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
		  } // End of actionPerformed
  } // End of ExitButtonListener class
} // End of CameraGUI class
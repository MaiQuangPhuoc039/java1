 package DB;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.text.TabStop;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import xml.dangNhap;
import xml.example1;
import xml.student;
import xml.userflappybird;

public class flappy_bird  extends JPanel implements Runnable, KeyListener, ActionListener{
      
       public static final int WIDTH = 700;
       public static final int HEIGHT = 400;
       public static boolean gameOver ;
       public static boolean pause= false;
       public static boolean out= false;
       public static boolean start= false;
//       public MatKhau matkhau;
       private String gioithieu, capdo, thua;
       private int xb=200 , vxb , vyb ,rb ;
	   private static int yb=30;
	   
       private int xc1=680, yc1=0 , vyc1=0 , caoCot1=30 , daiCot1=150;
	   private static int vxc1=2;
	 
       private int xc2= 680, yc2=250 , vyc2=0 , caoCot2=30 , daiCot2=150;
	   private static int vxc2=2;
	
	  private int xc3=400, yc3=0 ,vyc3=0, caoCot3, daiCot3;
	  private static int vxc3=2;
	
      private int xc4=400, yc4=200 , vyc4=0,  caoCot4,  daiCot4;
	private BufferedImage chim;
	private BufferedImage nen;
	  private static int vxc4=2;
	 
       private static int diem=0;
	private static JFrame frame;
       public flappy_bird(){
//   			try {
//				nen= ImageIO.read(getClass().getResourceAsStream("background.png"));
//
//				chim= ImageIO.read(getClass().getResourceAsStream("bird.gif"));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
    	   
    	   SwingUtilities.invokeLater(new Runnable() {
               @Override
               public void run() {
                }
           });
    	   
           thread_ball.start();
           thread_cot1.start();
           thread_cot2.start();
           thread_cot3.start();
           thread_cot4.start();
       }
	   
	public String getGioithieu() {
		return gioithieu;
	}
	public void setGioithieu(String gioithieu) {
		this.gioithieu = gioithieu;
	}
	public String getCapdo() {
		return capdo;
	}
	public void setCapdo(String capdo) {
		this.capdo = capdo;
	}
	public String getThua() {
		return thua;
	}
	public void setThua(String thua) {
		this.thua = thua;
	}
	public int getXb() {
		return xb;
	}
	public void setXb(int xb) {
		this.xb = xb;
	}
	public int getVxb() {
		return vxb;
	}
	public void setVxb(int vxb) {
		this.vxb = vxb;
	}
	public int getVyb() {
		return vyb;
	}
	public void setVyb(int vyb) {
		this.vyb = vyb;
	}
	public int getRb() {
		return rb;
	}
	public void setRb(int rb) {
		this.rb = rb;
	}
	public static int getYb() {
		return yb;
	}
	public static void setYb(int yb) {
		flappy_bird.yb = yb;
	}
	public int getXc1() {
		return xc1;
	}
	public void setXc1(int xc1) {
		this.xc1 = xc1;
	}
	public int getYc1() {
		return yc1;
	}
 	public void setYc1(int yc1) {
		this.yc1 = yc1;
	}
	public int getVyc1() {
		return vyc1;
	}
	public void setVyc1(int vyc1) {
		this.vyc1 = vyc1;
	}
	public int getCaoCot1() {
		return caoCot1;
	}
	public void setCaoCot1(int caoCot1) {
		this.caoCot1 = caoCot1;
	}
	public int getDaiCot1() {
		return daiCot1;
	}
	public void setDaiCot1(int daiCot1) {
		this.daiCot1 = daiCot1;
	}
	public static int getVxc1() {
		return vxc1;
	}
	public static void setVxc1(int vxc1) {
		flappy_bird.vxc1 = vxc1;
	}
	public int getXc2() {
		return xc2;
	}
	public void setXc2(int xc2) {
		this.xc2 = xc2;
	}
	public int getYc2() {
		return yc2;
	}
	public void setYc2(int yc2) {
		this.yc2 = yc2;
	}
	public int getVyc2() {
		return vyc2;
	}
	public void setVyc2(int vyc2) {
		this.vyc2 = vyc2;
	}
	public int getCaoCot2() {
		return caoCot2;
	}
	public void setCaoCot2(int caoCot2) {
		this.caoCot2 = caoCot2;
	}
	public int getDaiCot2() {
		return daiCot2;
	}
	public void setDaiCot2(int daiCot2) {
		this.daiCot2 = daiCot2;
	}
	public static int getVxc2() {
		return vxc2;
	}
	public static void setVxc2(int vxc2) {
		flappy_bird.vxc2 = vxc2;
	}
   public int getXc3() {
		return xc3;
	} public void setXc3(int xc3) {
		this.xc3 = xc3;
	}
	 public int getYc3() {
		return yc3;
	}
 public void setYc3(int yc3) {
		this.yc3 = yc3;
	}
 public int getVyc3() {
		return vyc3;
	} public void setVyc3(int vyc3) {
		this.vyc3 = vyc3;
	} public int getCaoCot3() {
		return caoCot3;
	} public void setCaoCot3(int caoCot3) {
		this.caoCot3 = caoCot3;
	} 
	public int getDaiCot3() {
		return daiCot3;
	} 
	public void setDaiCot3(int daiCot3) {
		this.daiCot3 = daiCot3;
	}
 
	public static int getVxc3() {
		return vxc3;
	}
 
	public static void setVxc3(int vxc3) {
		flappy_bird.vxc3 = vxc3;
	}
	public int getXc4() {
		return xc4;
	}
 
	public void setXc4(int xc4) {
		this.xc4 = xc4;
	}
 
	public int getYc4() {
		return yc4;
	}

	public void setYc4(int yc4) {
		this.yc4 = yc4;
	}
	public int getVyc4() {
		return vyc4;
	}
	public void setVyc4(int vyc4) {
		this.vyc4 = vyc4;
	}
	public int getCaoCot4() {
		return caoCot4;
	}
	public void setCaoCot4(int caoCot4) {
		this.caoCot4 = caoCot4;
	}
	public int getDaiCot4() {
		return daiCot4;
	}
	public void setDaiCot4(int daiCot4) {
		this.daiCot4 = daiCot4;
	}
	public static int getVxc4() {
		return vxc4;
	}
	public static void setVxc4(int vxc4) {
		flappy_bird.vxc4 = vxc4;
	}
	public int getDiem() {
		return diem;
	}

	public void setDiem(int diem) {
		this.diem = diem;
	}
	
	@Override
	public String toString() {
		return "flappy_bird \n\n gioithieu: " + gioithieu + "\n\n capdo : " + capdo + "\n\n quy luat : " + thua + 
				"\n\n ToaDoBird \n xb=" + xb +", yb="+yb+ ", vxb=" + vxb + ", vyb=" + vyb + ", rb=" + rb +
        "\n\n toaDoCot \n xc1=" + xc1 + ", yc1=" + yc1 + " , vxc1 = "+vxc1+", vyc1 = "+vyc1+", caoCot1 ="+caoCot1+", daiCot1= "+daiCot1+
        "\n\n toaDoCot \n xc2=" + xc2 + ", yc2=" + yc2 + " , vxc2 = "+vxc2+", vyc2 = "+vyc2+", caoCot2 ="+caoCot2+", daiCot2= "+daiCot2+
        "\n\n toaDoCot \n xc3=" + xc3 + ", yc3=" + yc3 + " , vxc3 = "+vxc3+", vyc3 = "+vyc3+", caoCot3 ="+caoCot3+", daiCot3= "+daiCot3+
        "\n\n toaDoCot \n xc4=" + xc4 + ", yc4=" + yc4 + " , vxc4 = "+vxc4+", vyc4 = "+vyc4+", caoCot4 ="+caoCot4+", daiCot4= "+daiCot4;
	}

	public void paintComponent(Graphics g) {
    	   super.paintComponent(g);
    	   g.setColor(Color.DARK_GRAY);
    	   g.fillRect(0, 0, WIDTH, HEIGHT);
//    	   g.drawImage(nen, 0, 0, null);

//    	   g.drawImage(chim, xb, yb, null);
//
//    	   g.drawImage(chim, xb, yb, null);

    	   g.setColor(Color.yellow.darker());
    	   g.fillOval(xb, yb, rb, rb);  
 
    	   g.setColor(Color.red);
    	   g.fillRect(xc1, yc1, caoCot1, daiCot1);

    	   g.setColor(Color.blue);
    	   g.fillRect(xc2, yc2, caoCot2, daiCot2);
    	   
    	   g.setColor(Color.white);
    	   g.fillRect(xc3, yc3, caoCot3, daiCot3);
    	    
    	   g.setColor(Color.white);
    	   g.fillRect(xc4, yc4, caoCot4, daiCot4);
    	   
    	   Rectangle birdRec = new Rectangle(xb, yb, 30, 30);
           Rectangle cot1Rec = new Rectangle(xc1, yc1, caoCot1, daiCot1);
           Rectangle cot2Rec = new Rectangle(xc2, yc2, caoCot2, daiCot2);
           Rectangle cot3Rec = new Rectangle(xc3, yc3, caoCot3, daiCot3);
           Rectangle cot4Rec = new Rectangle(xc4, yc4, caoCot4, daiCot4);
            
           // in diem va toc do game
           g.setFont(new Font("Arial" , 1, 20));
           g.setColor(Color.orange);
           g.drawString("SCORE :"+diem, 0, 30);
           if(diem>10 && diem>=0) {
       	      vxc1=4; vxc2=4;   vxc3=4; vxc4=4;
           }
           if(diem>20) {
          	     vxc1=6; vxc2=6;   vxc3=6; vxc4=6;
           }else if(diem >30) {
              	    vxc1=8; vxc2=8;   vxc3=8; vxc4=8;
           }
           
           // st font   
           g.setColor(Color.yellow);
           g.setFont(new Font("Arial", 1, 20));
           
           
           if(gameOver) {
        	   g.drawString("GAME OVER!  ",  70,150);
//        	    vyb=0; vxc1=0; vxc2=0;   vxc3=0; vxc4=0;
        	   pause=true;
           }
           
           // tạm dừng game
           if(pause==true) {
      
        	   g.drawString("ESPACE: NEXT/STOP", 70,200 );
        	   g.drawString(" O : OUT ", 70, 270);
        	   g.drawString(" I : DOWNLIFE",70, 320);
        	   vyb=0;    vxc1=0; vxc2=0;   vxc3=0; vxc4=0; 
           }
           
             // va chạm bi và cột
            if (birdRec.intersects(cot1Rec) || birdRec.intersects(cot2Rec) 
            		|| birdRec.intersects(cot3Rec) || birdRec.intersects(cot4Rec) ) {
              gameOver=true;
             
           }
       }

	Thread thread_ball= new Thread(new Runnable() {
		@Override
		public void run() {
			while(true) {
				   xb-=vxb;
    		       yb-=vyb;
    	           vxb=0;
    	           vyb=-5;
    	           rb=30 ;
    	   repaint();
//    	   if(xb< 0 || xb>WIDTH-rb) {
//    		   gameOver=true;
//           }
    	   // neu ball cham bien ngang thi thua cuoc
    	   if(yb<0 || yb> HEIGHT-rb) {
    		   gameOver=true;
    	   }
    	   try {
			Thread.sleep(30);
		} catch (Exception e) {
		}
			}
		}
	});
            
       Thread thread_cot1  = new Thread(new Runnable() {
		@Override
		public void run() {
			while(true) {
				xc1-=vxc1;
				yc1-=vyc1;
				vxc1 =2;
				vyc1=0;
				caoCot1=30;
				daiCot1=150;
				// neu cot cham bien thi cot tro ve vi tri ban dau
				if(xc1<0 ) {
					xc1=WIDTH-caoCot1;
				} 
//				if(yc1<0 || yc1> HEIGHT-caoCot1) {
//					yc1=HEIGHT-caoCot1;
//				}
				repaint();
				try {
					Thread.sleep(10);
				} catch (Exception e) {
				}
				
			}
		}
	});
       
       Thread thread_cot2= new Thread(new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				xc2-=vxc2;
				yc2-=vyc2;
				vxc2 =2;
				vyc2=0;
				caoCot2=30;
				daiCot2=150;
				
				if(xc2<0  ) {
					xc2=WIDTH-caoCot2;
				}
				if(xc2 == 180 ) {
					diem++;
				}
				repaint();
				try {
					Thread.sleep(10);
				} catch (Exception e) {
				}
				
			}
		}
	});
       
       Thread thread_cot3  = new Thread(new Runnable() {
   		@Override
   		public void run() {
   			while(true) {
   				xc3-=vxc3;
   				yc3-=vyc3;
   				vxc3 =2;
   				vyc3=0;
   				caoCot3=30;
   				daiCot3=100;
   				if(xc3<0  ) {
   					xc3=WIDTH-caoCot3;
   					 
//   						diem++;
   				} 
   				if(xc3 == 180) {
   					diem++;
   				}
//   				if(yc3<0 || yc3> HEIGHT-caoCot3) {
//   					yc3=HEIGHT-caoCot3;
//   				}
   				
   				repaint();
   				try {
   					Thread.sleep(10);
   				} catch (Exception e) {
   				}
   				
   			}
   		}
   	});
          
          Thread thread_cot4= new Thread(new Runnable() {
   		
   		@Override
   		public void run() {
   			while(true) {
   				xc4-=vxc4;
   				yc4-=vyc4;
   				vxc4 =2;
   				vyc4=0;
   				caoCot4=30;
   				daiCot4=200;
   				if(xc4<0) {
   					xc4=WIDTH-caoCot4;
   				} 
//   				if(yc4<0 || yc4> HEIGHT-caoCot4) {
//   					yc4=HEIGHT-caoCot4;
//   				}
   				repaint();
   				try {
   					Thread.sleep(10);
   				} catch (Exception e) {
   				}
   				
   			}
   		}
   	});
       
       
       public static void input() {
    		FileInputStream fileInputStream= null;
    		BufferedInputStream bufferedInputStream= null;
    		try {
    			fileInputStream = new FileInputStream( "C:\\java2\\flappy_bird\\src\\DB\\flappy_bird.java");
    			bufferedInputStream = new BufferedInputStream(fileInputStream);
    			byte[] data = new byte[20000];
    			int lenght = bufferedInputStream.read(data);
    		    System.out.println("Length : " +lenght);
    		    String kq = new String(data, 0 , lenght);
    		    System.out.println(kq);
    			
    		} catch (Exception e) {
    		}finally {
    			if(fileInputStream !=null) {
    				try {
    					fileInputStream.close();
    				} catch (IOException e1) {
    					e1.printStackTrace();
    				}
    			}if(bufferedInputStream !=null) {
    				try {
    					bufferedInputStream.close();
    				} catch (IOException e1) {
    					e1.printStackTrace();
    				}
    			}
    		}
       }
       
       public static void chay() {
    	   frame.addKeyListener(new KeyAdapter() {
           	public void keyPressed(KeyEvent e) {
           		int keyCode=e.getKeyCode();
           		
           		if(keyCode == KeyEvent.VK_SPACE) {
           			yb-=35;
           		}
           		
           		if(keyCode==KeyEvent.VK_O) {
           			 JOptionPane.showMessageDialog(null, "EXIT !! \n Diem : "+diem);
           			 
           			System.exit(0);
           		}
           		
           		if(keyCode==KeyEvent.VK_I) {
           			 input();
           		}
           		
           	  if(keyCode == KeyEvent.VK_X) {
           		  try {

             			File inputfile = new File("C:\\java2\\flappy_bird\\src\\xml\\xmFlappy_bird.xml");
             			SAXParserFactory factory = SAXParserFactory.newInstance();
             			SAXParser saxParser = factory.newSAXParser();
             			userflappybird user = new userflappybird();
                        
                        // phân tích tài liệu XML
                        saxParser.parse(inputfile, user);

                         
                        // in list đối tượng flappy_bird ra màn hình
                        for (xml.flappy_bird fb :user.getflappy_birdList()) {
                            System.out.println(fb.toString());
                        }
             		} catch (Exception ex) {
             			// TODO: handle exception
             		}
           	  }
           		
           		if(keyCode==KeyEvent.VK_ESCAPE) {
           			 if(pause==false) {
           				 pause=true;
           				 }else {
           					 pause=false;
           					 vxc1=3; 
           					 vxc2=3;
           					 vxc3=3; 
           					 vxc4=3;
           				 }
           		}if(keyCode==KeyEvent.VK_S) {
           			if(start ==false) {
           				start=true;
           			}
           		}
           		
           	}
			});
       }
       
       
       public static void main(String[] args) {
    	   
    	   
//    	   new MatKhau();
    	    
    	     frame = new JFrame("Flappy Bird");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setPreferredSize(new Dimension(WIDTH+20, HEIGHT+35));		
           frame.setContentPane(new flappy_bird());
           frame.pack();
           frame.setLocationRelativeTo(null);
           
           chay();
           
//           frame.addKeyListener(new KeyAdapter() {
//            	public void keyPressed(KeyEvent e) {
//            		int keyCode=e.getKeyCode();
//            		
//            		if(keyCode == KeyEvent.VK_SPACE) {
//            			yb-=35;
//            		}
//            		
//            		if(keyCode==KeyEvent.VK_O) {
//            			 JOptionPane.showMessageDialog(null, "EXIT !! \n Diem : "+diem);
//            			 
//            			System.exit(0);
//            		}
//            		
//            		if(keyCode==KeyEvent.VK_I) {
//            			 input();
//            		}
//            		
//            	  if(keyCode == KeyEvent.VK_X) {
//            		  try {
//
//              			File inputfile = new File("C:\\java2\\flappy_bird\\src\\xml\\xmFlappy_bird.xml");
//              			SAXParserFactory factory = SAXParserFactory.newInstance();
//              			SAXParser saxParser = factory.newSAXParser();
//              			userflappybird user = new userflappybird();
//                         
//                         // phân tích tài liệu XML
//                         saxParser.parse(inputfile, user);
//
//                          
//                         // in list đối tượng flappy_bird ra màn hình
//                         for (xml.flappy_bird fb :user.getflappy_birdList()) {
//                             System.out.println(fb.toString());
//                         }
//              		} catch (Exception ex) {
//              			// TODO: handle exception
//              		}
//            	  }
//            		
//            		if(keyCode==KeyEvent.VK_ESCAPE) {
//            			 if(pause==false) {
//            				 pause=true;
//            				 }else {
//            					 pause=false;
//            					 vxc1=3; 
//            					 vxc2=3;
//            					 vxc3=3; 
//            					 vxc4=3;
//            				 }
//            		}if(keyCode==KeyEvent.VK_S) {
//            			if(start ==false) {
//            				start=true;
//            			}
//            		}
//            		
//            	}
//			});
            
           frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}

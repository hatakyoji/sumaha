import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;


public class sumaha2{

	public static void main(String[] args) {
//    	String[] StrArray = new String[1500000000];
    	
    	BufferedReader br = null;
    	int i = 0;
    	int roop = 0;
		ArrayList<String>array = new ArrayList<String>();
		
        try {
            // ���͌��t�@�C���A�o�͐�t�@�C��
            File file = new File("C:/WORK/log2016-02-12_all.csv");
            FileWriter fw = new FileWriter("C:/Users/kyoji-ha/Desktop/output.csv", true);  //���P
          	PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
            br = new BufferedReader(new FileReader(file));
        	String line;
        	
        	// �P�s�Âǂݍ��ݏo�́B
            while ((line = br.readLine()) != null) {
            	String[] split = line.split(",",-1);
            	if(split[3].equals("TMP")){
            		array.add(split[0] + "," + split[1] + "," + split[2] + "," + "," + "," + "," + "1" + "," + "," + "," + "," + "," + "," + "," + "," + "," + "," + split[6] + "," + split[7] + "," + split[8]);
            	}else if(split[3].equals("TH")){
            		array.add(split[0] + "," + split[1] + "," + split[2] + "," + split[4] + "," + split[5] + "," + "," + "," + "," + "," + "," + "," + "," + "," + "," + "," + "," + split[7] + "," + split[8] + "," + split[9]);
            	}else if(split[3].equals("PIR")){
            		array.add(split[0] + "," + split[1] + "," + split[2] + "," + "," + "," + "1" + "," + "," + "," + "," + "," + "," + "," + "," + "," + "," + "," + split[7] + "," + split[8] + "," + split[9]);
            	}else if(split[3].equals("ILL")){
            		array.add(split[0] + "," + split[1] + "," + split[2] + "," + "," + "," + "," + "," + split[4] + "," + "," + "," + "," + "," + "," + "," + "," + "," + split[7] + "," + split[8] + "," + split[9]);
            	}else if(split[3].equals("CO2")){
            		array.add(split[0] + "," + split[1] + "," + split[2] + "," + "," + "," + "," + "," + "," + split[4] + "," + split[5] + "," + split[6] + "," + "," + "," + "," + "," + "," + split[7] + "," + split[8] + "," + split[9]);
            	}else if(split[3].equals("LRNCO2")){
            		array.add(split[0] + "," + split[1] + "," + split[2] + "," + "," + "," + "," + "," + "," + "," + "," + "," + "," + "1" + "," + "," + "," + "," + split[7] + "," + ",");
            	}else if(split[3].equals("LRNPIR")){
            		array.add(split[0] + "," + split[1] + "," + split[2] + "," + "," + "," + "," + "," + "," + "," + "," + "," + "," + "," + "1" + "," + "," + "," + split[7] + "," + ",");
            	}else if(split[3].equals("LRNTMP")){
            		array.add(split[0] + "," + split[1] + "," + split[2] + "," + "," + "," + "," + "," + "," + "," + "," + "," + "," + "," + "," + "1" + "," + "," + split[7] + "," + ",");
            	}else if(split[3].equals("LRNTH")){
            		array.add(split[0] + "," + split[1] + "," + split[2] + "," + "," + "," + "," + "," + "," + "," + "," + "," + "," + "," + "," + "," + "1" + "," + split[7] + "," + ",");
            	}else if(split[3].equals("OPN")){
            		array.add(split[0] + "," + split[1] + "," + split[2] + "," + "," + "," + "," + "," + "," + "," + "," + "," + split[4] + "," + "," + "," + "," + "," + split[7] + "," + split[8] + "," + split[9]);
            	}else{
            		array.add("date" + "," + "time" + "," + "ID" + "," + "TH_ondo" + "," + "TH_situdo" + "," + "PIR" + "," + "TMP" + "," + "ILL" + "," + "CO2_noudo" + "," + "CO2_ondo" + "," + "CO2_situdo" + "," + "OPN" + "," + "LRN_CO2" + "," + "LRN_PIR" + "," + "LRN_TMP" + "," + "LRN_TH" + "," + "rawdata" + "," + "RSSI" + "," + "packetstring");
            	}
//            	System.out.println(array.get(i));
            	pw.println(array.get(i));
            	i++;
            		if(i%100000==0) System.out.println(i);

            	}
            	

        	
        	pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // �X�g���[���͕K�� finally �� close ���܂��B
                br.close();
            } catch (IOException e) {
            }
        }
        roop = i;
		
        //���̎��_��StrArray�Ɋi�[
		System.out.println(roop+"�s�ǂݍ��݂܂���");  

		
/*      try {
          //�o�͐���쐬����
          FileWriter fw = new FileWriter("C:/Users/kyoji-ha/Desktop/output.csv", true);  //���P
          PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
for(i=0;i<roop;i++){
          //���e���w�肷��
          pw.println(StrArray[i]);
}
          //�t�@�C���ɏ����o��
          pw.close();

          //�I�����b�Z�[�W����ʂɏo�͂���
         // System.out.println("�o�͂��������܂����B");

      }
		
		
		catch (IOException ex) {
          //��O������
          ex.printStackTrace();
      }
      */
	}
    }

    /**
     * �t�@�C����ǂݍ��݂܂��B
     *
     */
    
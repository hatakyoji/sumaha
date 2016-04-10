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
            // 入力元ファイル、出力先ファイル
            File file = new File("C:/WORK/log2016-02-12_all.csv");
            FileWriter fw = new FileWriter("C:/Users/kyoji-ha/Desktop/output.csv", true);  //※１
          	PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
            br = new BufferedReader(new FileReader(file));
        	String line;
        	
        	// １行づつ読み込み出力。
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
                // ストリームは必ず finally で close します。
                br.close();
            } catch (IOException e) {
            }
        }
        roop = i;
		
        //この時点でStrArrayに格納
		System.out.println(roop+"行読み込みました");  

		
/*      try {
          //出力先を作成する
          FileWriter fw = new FileWriter("C:/Users/kyoji-ha/Desktop/output.csv", true);  //※１
          PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
for(i=0;i<roop;i++){
          //内容を指定する
          pw.println(StrArray[i]);
}
          //ファイルに書き出す
          pw.close();

          //終了メッセージを画面に出力する
         // System.out.println("出力が完了しました。");

      }
		
		
		catch (IOException ex) {
          //例外時処理
          ex.printStackTrace();
      }
      */
	}
    }

    /**
     * ファイルを読み込みます。
     *
     */
    
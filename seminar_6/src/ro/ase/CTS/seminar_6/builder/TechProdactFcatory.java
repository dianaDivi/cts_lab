package ro.ase.CTS.seminar_6.builder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class TechProdactFcatory  extends AbstractProductFcatory{

	@Override
	public Product makeProduct() throws UnsupportedOperationException {
		return (Product) new TechProduct.TechProductBuilder(0);
	}

	@Override
	public String getCatalog() {
		
			ArrayList<String> records;
			StringBuilder builder=new StringBuilder();
			try {
				records = redRecordsFromFile("tech_products.csv");
				
				for(String redcord:records) {
				
					String[]productAttribite=	redcord.split(",");
					builder.append(productAttribite[0]+"-");
					builder.append(productAttribite[1]+"").append(productAttribite[2]+"")
					.append(productAttribite[3]+"/n");
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return builder.toString();
		
	}
	
	private ArrayList<String>redRecordsFromFile(String fileName) throws IOException{
		ArrayList<String>records=new ArrayList<String>();
		
		URL fileUrl= getClass().getResource(fileName);
		File productFile=new File(fileName);
		try {
			BufferedReader reader=new BufferedReader(new FileReader(productFile));
			String line;
			while((line=reader.readLine()) != null) {
				records.add(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return records;
	}

}

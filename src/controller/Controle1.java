package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controle1 implements IControle1 {

	@Override
	public void readFile(String path, String nome) throws IOException {
		File arq = new File(path, nome);
		if(arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				if(linha.contains("Fruits")) {				
//				System.out.println(linha);

				String [] separaTxt = linha.split(",");
//				System.out.println(Arrays.toString(separaTxt));
				System.out.println(separaTxt[0] + "\t" + separaTxt[1] + "\t" + separaTxt[2] + "\t" + separaTxt[3]);
				
				linha = buffer.readLine();
				}else {
					linha = buffer.readLine();
				}
			}
			buffer.close();
			leitor.close();
			fluxo.close();
			
			
		}else {
			throw new IOException("Arquivo Inválido");
		}
	}
	
	
	
	
}


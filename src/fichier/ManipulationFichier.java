package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		Path pathOrigine = Paths.get("C:/ProjetJava/recensement.csv");
		Path pathDestination = Paths.get("C:/ProjetJava/recensement2.csv");

		List<String> lines = Files.readAllLines(pathOrigine, StandardCharsets.UTF_8);
		List<String> selection = new ArrayList<String>();
	
		lines.remove(0); // on l'enlève car cela correspond au nom des colonnes
		selection.add("Nom de Ville;Numéro departement; Nombre habitant");

		
		for(int i=0; i<lines.size(); i++) {
			String[] line = lines.get(i).split(";");
			String nomVille = line[6];
			String numDep = line[2];
			int nbHab = Integer.parseInt(line[line.length-1].replace(" " , ""));
			if(nbHab >= 25_000) {
				Collections.addAll(selection, nomVille + ";" + numDep + ";" + nbHab);
			}
		}
		//Files.copy(pathOrigine, pathDestination, StandardCopyOption.REPLACE_EXISTING);
		Files.write(pathDestination, selection);
	}

}

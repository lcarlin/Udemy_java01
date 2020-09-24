package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		
		Consumer <String> emprimer = System.out::print ;
		Consumer <Integer> emprimerI = System.out::println ;
		
		Stream <String> langs = Stream.of("Java ","Dart ", "Clipper\n" );
		langs.forEach(emprimer);
		
		String [] maisLangs = {"Python ", "LIsP ", "COBOL \n"};
		
		Stream.of(maisLangs).forEach(emprimer);
		
		Arrays.stream(maisLangs).forEach(emprimer);
		
		Arrays.stream(maisLangs, 1, 2).forEach(emprimer);
		
		List<String > outrasLangs = Arrays.asList("C++ ", "SHELL ", "awk \n") ;
		outrasLangs.stream().forEach(emprimer);
		outrasLangs.parallelStream().forEach(emprimer);
		
		//Stream.generate(() -> "a").forEach(emprimer);
		//Stream.iterate(0, n-> n + 1).forEach(emprimerI);
		
				
	}

}

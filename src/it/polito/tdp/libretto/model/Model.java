package it.polito.tdp.libretto.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Model {
	
//	private List<Esame> esami;
//	private HashSet<Esame> esami ;
	private HashMap<String,Esame> esami;
	
	public Model() {
//		this.esami = new ArrayList<Esame>() ;
		this.esami=new HashMap<String,Esame>();
	}
	
	/**
	 * Aggiunge un nuovo esame all'elenco degli esami presenti,
	 * verificando che non ci sia gi�
	 * @param e
	 * @return true se l'ha inserito, false se esisteva gi� e quindi non l'ha potuto inserire
	 */
	public boolean addEsame(Esame e) {
//		linkedList e hashset
//		if(!esami.contains(e)) {
//			esami.add(e) ;
//			return true ;
//		} else {
//			return false ;
//		}
		
//		hashmap	
		if(!esami.containsKey(e.getCodice())) {
			esami.put(e.getCodice(),e) ;
			return true ;
		} else {
			return false ;
		}
	}
	
	/**
	 * Ricerca se esiste un esame con il codice specificato.
	 * Se esiste, lo restituisce, altrimenti restituisce null.
	 * @param codice codice dell'esame da ricercare
	 * @return l'esame trovato, oppure null se non trovato
	 */
	public Esame trovaEsame(String codice) {
//		linkedList
//		int pos = esami.indexOf( new Esame(codice, null, null) ) ;
//		if(pos==-1) {
//			return null ;
//		} else {
//			return esami.get(pos) ;
//		}
		
//		hashSet
			// controllo se la collezione contiene l'esame
//		if(esami.contains(new Esame(codice,null,null))){
//			Iterator<Esame> it=esami.iterator();
//			while(it.hasNext()){
//				Esame e=it.next();
//				if (e.equals(new Esame(codice,null,null)))
//					return e;
//			}
//			return null;
//		}
//		else{
//			return null;
//		}
		
//		hashmap
		return esami.get(codice);
		
	}

}

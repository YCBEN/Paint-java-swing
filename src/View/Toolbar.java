package View;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Toolbar extends JFrame{
	
	
	public Toolbar () {
		
		
		setTitle("Paint");
		setBounds(0,0,800,500);
		setResizable(false);
		setLocationRelativeTo(null);
		
		
		
		
		
		
		//Creation de la barre de tache
				JMenuBar toolbar = new JMenuBar();
				
				// les elements de la barre de tache 
					//Fichier  
						JMenu file = new JMenu("Fichier");
						
							JMenuItem nouvelle_image = new JMenuItem("nouvelle image");
							JMenuItem ouvrir_fichier_image = new JMenuItem("ouvrir fichier image");
							JMenuItem enregistrer = new JMenuItem("enregistrer");
							JMenuItem enregistrer_sous = new JMenuItem("enregistrer_sous");
							JMenuItem imprimer = new JMenuItem("imprimer");
							JMenuItem mise_en_page = new JMenuItem("mise en page");
							JMenuItem fermer_image = new JMenuItem("fermer image");
							JMenuItem quitter = new JMenuItem("quitter");
							
							//Montage du file Jmenu
							
							file.add(nouvelle_image);
							file.add(ouvrir_fichier_image);
							file.addSeparator();
							file.add(enregistrer);
							file.add(enregistrer_sous);
							file.addSeparator();
							file.add(imprimer);
							file.add(mise_en_page);
							file.add(fermer_image);
							file.addSeparator();
							file.add(quitter);
						
						// Montage file dans le toolbar
						
						toolbar.add(file);
						
						//******************************************************************************************************
					
					//Edition
						JMenu edition =new JMenu("Edition");
							//selection items
							JMenu selection =new JMenu("Selection");
						
								JMenuItem d�tection_de_contour = new JMenuItem("d�tection de contour"); 
								JMenuItem s�lectionner_tout = new JMenuItem("s�lectionner tout"); 
								JMenuItem s�lection_par_couleurs = new JMenuItem("s�lection par couleurs"); 
								JMenuItem s�lection_rectangulaire = new JMenuItem("s�lection rectangulaire"); 
								JMenuItem s�lection_main_lev�e = new JMenuItem("s�lection � main lev�e"); 
								
								//Montage submenu selection
								
								selection.add(d�tection_de_contour);
								selection.addSeparator();
								selection.add(s�lectionner_tout);
								selection.add(s�lection_par_couleurs);
								selection.add(s�lection_rectangulaire);
								selection.add(s�lection_main_lev�e);
															
							//*********************************
						
							JMenuItem effacer_contenu_image = new JMenuItem("effacer contenu image");
							JMenuItem copier = new JMenuItem("copier");
							JMenuItem couper = new JMenuItem("couper");
							
							//coller submenu
							JMenu coller = new JMenu("coller");
								JMenuItem collersub = new JMenuItem("coller");
								JMenuItem coller_comme_nouvelle_image = new JMenuItem("coller comme nouvelle image");
								// Montage submenu coller
								coller.add(collersub);
								coller.add(coller_comme_nouvelle_image);
								
							//*********************************************
							JMenuItem dupliquer_image = new JMenuItem("dupliquer image");
							JMenuItem annuler = new JMenuItem("annuler");
							JMenuItem historique_annulation = new JMenuItem("historique d�annulation");
								
						//Montage menu edition 	
						edition.add(selection);	
						edition.addSeparator();
						edition.add(effacer_contenu_image);
						edition.add(copier);
						edition.add(couper);
						edition.add(coller);
						edition.addSeparator();
						edition.add(dupliquer_image);
						edition.add(annuler);
						edition.add(historique_annulation);
						
							
						
						toolbar.add(edition);
	
						//******************************************************************************************************
					//Insertion 
						JMenu insertion = new JMenu("Insertion");
						JMenuItem cercle = new JMenuItem("Cercle");
						JMenuItem painceau = new JMenuItem("Painceau");
						//to add more
						
						//Montage menu insertion
						insertion.add(cercle);
						insertion.add(painceau);
						
						toolbar.add(insertion);

						//******************************************************************************************************	
					//Outils
						JMenu outils = new JMenu("Outils");
						JMenuItem crayon = new JMenuItem("Crayon");
						JMenuItem rectangle = new JMenuItem("Rectangle");
						JMenuItem gomme = new JMenuItem("Gomme");
						
						//Montage menu outils
						outils.add(crayon);
						outils.add(rectangle);
						outils.addSeparator();
						outils.add(gomme);
						
						toolbar.add(outils);

						//******************************************************************************************************
					//Couleurs
						JMenu couleurs = new JMenu("Couleurs");
						
						JMenuItem colorer_selection = new JMenuItem("colorer s�lection");
						JMenuItem balance_couleurs = new JMenuItem("balance des couleurs");
						JMenuItem inverser_couleurs = new JMenuItem("inverser couleurs");
						JMenuItem luminosit� = new JMenuItem("luminosit�");
						
						JMenu contraste  =new JMenu("contraste");
							JMenuItem augmenter_contraste = new JMenuItem("Augmenter le contraste");
							contraste.add(augmenter_contraste);
						
						JMenu nettet� = new JMenu("nettet�");
							JMenuItem flou_gaussien = new JMenuItem("flou gaussien");
							JMenuItem flou_cin�tique = new JMenuItem("flou cin�tique");
							JMenuItem renforcer_nettet� = new JMenuItem("renforcer la nettet�");
							
							nettet�.add(flou_gaussien);
							nettet�.add(flou_cin�tique);
							nettet�.add(renforcer_nettet�);
						
						JMenu effets = new JMenu("effets");
							JMenuItem effet_soleil_levant = new JMenuItem("effet soleil levant");
							JMenuItem effet_toile_impressionniste = new JMenuItem("effet toile impressionniste");
							JMenuItem effet_mosa�que = new JMenuItem("effet mosa�que");
							
							effets.add(effet_soleil_levant);
							effets.add(effet_toile_impressionniste);
							effets.add(effet_mosa�que);
							
						JMenuItem mode_niveaux_gris =new JMenuItem("mode niveaux de gris");
						
						//Montage menu Couleurs
						couleurs.add(colorer_selection);
						couleurs.add(balance_couleurs);
						couleurs.add(inverser_couleurs);
						couleurs.addSeparator();
						couleurs.add(luminosit�);
						couleurs.add(contraste);
						couleurs.add(nettet�);
						couleurs.add(effets);
						couleurs.add(mode_niveaux_gris);
						
						toolbar.add(couleurs);
						
						//******************************************************************************************************
					//Image
						JMenu image = new JMenu("Image");
						
						JMenuItem deplacement = new JMenuItem("D�placement");
						JMenuItem retourner = new JMenuItem("Retourner");
						
						//Montage menu Image						
						image.add(deplacement);
						image.add(retourner);
						
						toolbar.add(image);
						
						//******************************************************************************************************
					//Affichage
						JMenu affichage =new JMenu("Affichage");
						
						JMenuItem ajuster_image_fen�tre = new JMenuItem("Ajuster l�image � la fen�tre");
						JMenuItem plein_�cran = new JMenuItem("plein �cran");
						JMenuItem taille_impression = new JMenuItem("taille de l�impression");
						JMenuItem taille_image = new JMenuItem("taille de l�image");
						
						JMenu rotation = new JMenu("rotation");
							JMenuItem rotation_droite = new JMenuItem("rotation droite");
							JMenuItem rotation_gauche = new JMenuItem("rotation gauche");
							
							rotation.add(rotation_droite);
							rotation.add(rotation_gauche);
						
						JMenu zoom =new JMenu("zoom");
							JMenuItem zoom_avant =new  JMenuItem("zoom avant");
							JMenuItem zoom_arri�re = new JMenuItem("zoom arri�re");
							
							zoom.add(zoom_avant);
							zoom.add(zoom_arri�re);
							
						JMenuItem pr�f�rences = new JMenuItem("pr�f�rences");
						
						//Montage menu Affichage
						affichage.add(ajuster_image_fen�tre);
						affichage.add(plein_�cran);
						affichage.addSeparator();
						affichage.add(taille_impression);
						affichage.add(taille_image);
						affichage.addSeparator();
						affichage.add(rotation);
						affichage.add(zoom);
						affichage.addSeparator();
						affichage.add(pr�f�rences);
						
						toolbar.add(affichage);
						
						//******************************************************************************************************
					//Aide
						JMenu aide = new JMenu("Aide");
						JMenuItem aide_sub = new JMenuItem("Aide");
						JMenuItem aide_contextuelle = new JMenuItem("Aide contextuelle");
						
						aide.add(aide_sub);
						aide.add(aide_contextuelle);
						
						toolbar.add(aide);
						//******************************************************************************************************
						
						
						
						
						
	//***********************Test***********************					
						
	this.setLayout( new BorderLayout(10,10));					
				
	this.add(toolbar,BorderLayout.NORTH);
				
				
			
	}
	//***********************Test***********************
	
	public static void main(String [] args) {
		Toolbar t=new Toolbar();
		t.setVisible(true);
		
			
	}
	
}



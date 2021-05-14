//Nome: Rafael Cruz - RA: 2266261

import java.util.List;
import java.util.ArrayList;

public class GerEmb {

    private final List<Navio> bdNav = new ArrayList<Navio>();
    private final List<Veleiro> bdVel = new ArrayList<Veleiro>();
    private final List<JetSki> bdJet = new ArrayList<JetSki>();
    private Navio navio;
    private Veleiro veleiro;
    private JetSki jetski;
    
    public List<Navio> getBdNav(){
        return bdNav;
    }
    
    public List<Veleiro> getBdVel(){
        return bdVel;
    }
    
    public List<JetSki> getBdJet(){
        return bdJet;
    }

//==========================Navio=============================================================
    public Navio cadastroNavio(Navio navio) {

        if (ConsNavio(navio) == null) {
            bdNav.add(navio);
            return navio;
        } else {
            return null;
        }
    }

    //===========listagem de todos os navios=============================================================
    public void listaNavio() {
        for (int i = 0; i < bdNav.size(); i++) {
            bdNav.get(i).getNavio();
        }

        if (bdNav.isEmpty()) {
            System.out.println("Lista Vazia");
        }
    }

    //==========consulta a partir do codigo============================================================
    public Navio ConsNavio(Navio navio) {
        for (int i = 0; i < bdNav.size(); i++) {
            if (navio.getCodigo() == bdNav.get(i).getCodigo()) {
                return bdNav.get(i);
            }
        }
        return null;
    }
    
//============================Veleiro=================================================================
    public Veleiro cadVeleiro(Veleiro veleiro) {

        if (ConsVeleiro(veleiro) == null) {
            bdVel.add(veleiro);
            return veleiro;
        } else {
            return null;
        }
    }

    //===============Listagem de Veleiros ========================================================
    public void listaVeleiro() {
        for (int i = 0; i < bdVel.size(); i++) {
            bdVel.get(i).getVeleiro();
        }

        if (bdVel.isEmpty()) {
            System.out.println("Lista Vazia");
        }
    }

//=================Consulta de Veleiro=============================================================
    public Veleiro ConsVeleiro(Veleiro veleiro) {
        for (int i = 0; i < bdVel.size(); i++) {
            if (veleiro.getCodigo() == bdVel.get(i).getCodigo()) {
                return bdVel.get(i);
            }
        }
        return null;
    }

//=====================JetSki==================================================================================
    public JetSki cadJetSki(JetSki jetski) {

        if (ConsVeleiro(veleiro) == null) {
            bdJet.add(jetski);
            return jetski;
        } else {
            return null;
        }
    }
//=================Listagem JetSki===========

    public void listaJetSki() {
        for (int i = 0; i < bdJet.size(); i++) {
            bdJet.get(i).getJetSki();
        }

        if (bdJet.isEmpty()) {
            System.out.println("Lista Vazia");
        }
    }

//===============Consulta de JetSki==========
    public JetSki ConsJet(JetSki jetski) {
        for (int i = 0; i < bdJet.size(); i++) {
            if (jetski.getCodigo() == bdJet.get(i).getCodigo()) {
                return bdJet.get(i);
            }
        }
        return null;
    }
}

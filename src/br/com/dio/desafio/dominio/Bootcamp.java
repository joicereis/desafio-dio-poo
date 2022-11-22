package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    //a data inicial é fixa com a data de hj
    private final LocalDate DATAINICIO = LocalDate.now();
    //a data final é fixa e é de 45 após a data inicial
    private final LocalDate DATAFIM = DATAINICIO.plusDays(45);
    private Set<Desenvolvedor> devsIncritos = new HashSet<>();
    private Set<Conteudo> conteudosBootcamp = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDATAINICIO() {
        return DATAINICIO;
    }
    public LocalDate getDATAFIM() {
        return DATAFIM;
    }
    public Set<Desenvolvedor> getDevsIncritos() {
        return devsIncritos;
    }
    public void setDevsIncritos(Set<Desenvolvedor> devsIncritos) {
        this.devsIncritos = devsIncritos;
    }
    public Set<Conteudo> getConteudosBootcamp() {
        return conteudosBootcamp;
    }
    public void setConteudosBootcamp(Set<Conteudo> conteudosBootcamp) {
        this.conteudosBootcamp = conteudosBootcamp;
    }

    //foram gerados equals e hashcodes por estar trabalhando com HashSet
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((DATAINICIO == null) ? 0 : DATAINICIO.hashCode());
        result = prime * result + ((DATAFIM == null) ? 0 : DATAFIM.hashCode());
        result = prime * result + ((devsIncritos == null) ? 0 : devsIncritos.hashCode());
        result = prime * result + ((conteudosBootcamp == null) ? 0 : conteudosBootcamp.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bootcamp other = (Bootcamp) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (DATAINICIO == null) {
            if (other.DATAINICIO != null)
                return false;
        } else if (!DATAINICIO.equals(other.DATAINICIO))
            return false;
        if (DATAFIM == null) {
            if (other.DATAFIM != null)
                return false;
        } else if (!DATAFIM.equals(other.DATAFIM))
            return false;
        if (devsIncritos == null) {
            if (other.devsIncritos != null)
                return false;
        } else if (!devsIncritos.equals(other.devsIncritos))
            return false;
        if (conteudosBootcamp == null) {
            if (other.conteudosBootcamp != null)
                return false;
        } else if (!conteudosBootcamp.equals(other.conteudosBootcamp))
            return false;
        return true;
    }
}

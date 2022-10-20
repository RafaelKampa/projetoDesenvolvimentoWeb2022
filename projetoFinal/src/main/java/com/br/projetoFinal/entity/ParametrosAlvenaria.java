package com.br.projetoFinal.entity;

import com.br.projetoFinal.dto.ParametrosAlvenariaDto;

import javax.persistence.*;

@Table(name = "PARAMETROS_ALVENARIA")
@SqlResultSetMappings({
        @SqlResultSetMapping(name = "ParametrosAlvenaria.dtoMapping", classes = {
                @ConstructorResult(targetClass = ParametrosAlvenariaDto.class,
                        columns ={
                                @ColumnResult(name = "ID", type = Integer.class),
                                @ColumnResult(name = "ID_AVALIACAO", type = Integer.class),
                                @ColumnResult(name = "PRUMO", type = Boolean.class),
                                @ColumnResult(name = "NIVEL", type = Boolean.class),
                                @ColumnResult(name = "ALINHAMENTO", type = Boolean.class),
                                @ColumnResult(name = "DIMENSOES", type = Boolean.class),
                                @ColumnResult(name = "INTEGRIDADE", type = Boolean.class),
                                @ColumnResult(name = "LIMPEZA", type = Boolean.class),
                                @ColumnResult(name = "OBS", type = String.class)
                        }
                )
        })
})
@NamedNativeQueries({
        @NamedNativeQuery(name="ParametrosAlvenaria.buscarPorAvaliacao", query = "SELECT * FROM PARAMETROS_ALVENARIA WHERE ID_AVALIACAO = :ID_AVALIACAO", resultSetMapping = "PARAMETROS_ALVENARIA.dtoMapping")
})
public class ParametrosAlvenaria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idParametrosAlvenaria;

    @Column(name = "ID_AVALIACAO", nullable = false)
    private Integer idAvaliacao;

    @Column(name = "PRUMO", nullable = false)
    private Boolean prumo;

    @Column(name = "NIVEL", nullable = false)
    private Boolean nivel;

    @Column(name = "ALINHAMENTO", nullable = false)
    private Boolean alinhamento;

    @Column(name = "DIMENSOES", nullable = false)
    private Boolean dimensoes;

    @Column(name = "INTEGRIDADE", nullable = false)
    private Boolean integridade;

    @Column(name = "LIMPEZA", nullable = false)
    private Boolean limpeza;

    @Column(name = "OBS")
    private String obs;

    public Integer getIdParametrosAlvenaria() {
        return idParametrosAlvenaria;
    }

    public void setIdParametrosAlvenaria(Integer idParametrosAlvenaria) {
        this.idParametrosAlvenaria = idParametrosAlvenaria;
    }

    public Integer getIdAvaliacao() {
        return idAvaliacao;
    }

    public void setIdAvaliacao(Integer idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    public Boolean getPrumo() {
        return prumo;
    }

    public void setPrumo(Boolean prumo) {
        this.prumo = prumo;
    }

    public Boolean getNivel() {
        return nivel;
    }

    public void setNivel(Boolean nivel) {
        this.nivel = nivel;
    }

    public Boolean getAlinhamento() {
        return alinhamento;
    }

    public void setAlinhamento(Boolean alinhamento) {
        this.alinhamento = alinhamento;
    }

    public Boolean getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(Boolean dimensoes) {
        this.dimensoes = dimensoes;
    }

    public Boolean getIntegridade() {
        return integridade;
    }

    public void setIntegridade(Boolean integridade) {
        this.integridade = integridade;
    }

    public Boolean getLimpeza() {
        return limpeza;
    }

    public void setLimpeza(Boolean limpeza) {
        this.limpeza = limpeza;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}

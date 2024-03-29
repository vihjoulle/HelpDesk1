package com.victor.HelpDesk.domain.enums;

@SuppressWarnings({"unused", "UnnecessaryModifier"})
public enum Perfil {

 ADMIN (0, "ROLE_ADMIN"), CLIENTE (1, "ROLE_CLIENTE"), TECNICO (2, "ROLE_TECNICO");

    private final int codigo;
    private final String descricao;

    private Perfil(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static Perfil toEnum(Perfil x) {
        return x;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Perfil toEnum(Integer cod) throws IllegalAccessException {
        if(cod == null) {
            return null;
        }
        for (Perfil x: Perfil.values()){
            if(cod.equals(x.getCodigo())){
                return x;
            }
        }
        throw new IllegalAccessException("Perfil inválido");
    }
}



package br.com.estudo.ScreenMatch.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}

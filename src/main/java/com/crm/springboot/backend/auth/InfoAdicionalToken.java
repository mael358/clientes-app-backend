package com.crm.springboot.backend.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.crm.springboot.backend.models.entity.Usuario;
import com.crm.springboot.backend.models.services.IUsuarioService;


@SuppressWarnings("deprecation")
@Component
public class InfoAdicionalToken implements TokenEnhancer {

	@Autowired
	private IUsuarioService usuarioService;
	
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		
		Usuario user = usuarioService.findByUserName(authentication.getName());
		Map<String, Object> info = new HashMap<>();
		info.put("info_adicional", "hola ".concat(authentication.getName().concat(" jeje")));

		info.put("user_detail", "ID: " + user.getId() + ", Nombre : " + user.getUsername());
		
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		return accessToken;
	}

	
}

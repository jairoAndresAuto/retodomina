package co.com.sura.acelerador.enums;

import static co.com.sura.acelerador.util.Constantes.AUTORIZATION;
import static co.com.sura.acelerador.util.Constantes.CONTENTYPE;
import static co.com.sura.acelerador.util.Constantes.TOKEN_PARABANK;
import static co.com.sura.acelerador.util.Constantes.APPLICATIONJSON;

public enum EncabezadoParametros {

        AUTHORIZATION(AUTORIZATION, TOKEN_PARABANK),
        CONTENT_TYPE_APPLICATION_JSON(CONTENTYPE, APPLICATIONJSON);

        private String key;
        private String value;

        EncabezadoParametros(String key, String value){
                this.key = key;
                this.value = value;
        }

        public String getKey(){
                return key;
        }

        public String getValue(){
                return value;
        }

}

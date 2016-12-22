package nyc.c4q.tarynking.randomgiphycat.models;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tarynking on 11/26/16.
 */

public class GiphyModel {

        private Data data;
        private Meta meta;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The data
         */
        public Data getData() {
            return data;
        }

        /**
         *
         * @param data
         * The data
         */
        public void setData(Data data) {
            this.data = data;
        }

        /**
         *
         * @return
         * The meta
         */
        public Meta getMeta() {
            return meta;
        }

        /**
         *
         * @param meta
         * The meta
         */
        public void setMeta(Meta meta) {
            this.meta = meta;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }


}

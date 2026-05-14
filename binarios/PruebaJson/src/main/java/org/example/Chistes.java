package org.example;

public class Chistes {
        public Bitcoin bitcoin;
        public Bitcoin.Ethereum ethereum;


        public class Bitcoin {
            public Integer usd;
            public Integer eur;


            public class Ethereum {
                public Double usd;
                public Double eur;


            }

            @Override
            public String toString() {
                return "Bitcoin{" +
                        "usd=" + usd +
                        ", eur=" + eur +
                        '}';
            }
        }
    }


<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="xml" indent="yes"/>
    <xsl:template match="/">
        <createTransactionRequest xmlns="AnetApi/xml/v1/schema/AnetApiSchema.xsd">
            <merchantAuthentication>
                <name><xsl:value-of select="createTransactionRequest/merchantAuthentication/name"/></name>
                <transactionKey><xsl:value-of select="createTransactionRequest/merchantAuthentication/transactionKey"/></transactionKey>
            </merchantAuthentication>
            <refId><xsl:value-of select="createTransactionRequest/refId"/></refId>
            <transactionRequest>
                <transactionType><xsl:value-of select="createTransactionRequest/transactionRequest/transactionType"/></transactionType>
                <amount><xsl:value-of select="createTransactionRequest/transactionRequest/amount"/></amount>
                <payment>
                    <creditCard>
                        <cardNumber><xsl:value-of select="createTransactionRequest/transactionRequest/payment/creditCard/cardNumber"/></cardNumber>
                        <expirationDate><xsl:value-of select="createTransactionRequest/transactionRequest/payment/creditCard/expirationDate"/></expirationDate>
                        <cardCode><xsl:value-of select="createTransactionRequest/transactionRequest/payment/creditCard/cardCode"/></cardCode>
                    </creditCard>
                </payment>
                <customer>
                    <id><xsl:value-of select="createTransactionRequest/transactionRequest/customer/id"/></id>
                </customer>
            </transactionRequest>
        </createTransactionRequest>
    </xsl:template>
</xsl:stylesheet>
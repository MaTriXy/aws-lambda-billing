package pl.altkom.asc.lab.lambda.billing.invoicing

import pl.altkom.asc.lab.lambda.billing.aws.SQSPublisher

@SQSPublisher("\${INVOICE_GENERATION_REQUEST_QUEUE:}")
interface InvoiceGenerationRequestPublisher {

    fun publish(invoiceGenerationRequest: InvoiceGenerationRequest)

}
/*
 *  Copyright (c) Microsoft. All rights reserved.
 *  Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.microsoft.azure.sdk.iot.device.transport.amqps.exceptions;

import com.microsoft.azure.sdk.iot.device.exceptions.ProtocolException;

/**
 * This exception is thrown when a amqp:session:unattached-handle error is encountered over an AMQP connection
 *
 * See {@linktourl http://docs.oasis-open.org/amqp/core/v1.0/os/amqp-core-complete-v1.0-os.pdf}
 */
public class AmqpUnattachedHandleException extends ProtocolException
{
    public static final String errorCode = "amqp:session:unattached-handle";

    public AmqpUnattachedHandleException()
    {
        super();
        this.isRetryable = true;
    }

    public AmqpUnattachedHandleException(String message)
    {
        super(message);
        this.isRetryable = true;
    }

    public AmqpUnattachedHandleException(String message, Throwable cause)
    {
        super(message, cause);
        this.isRetryable = true;
    }

    public AmqpUnattachedHandleException(Throwable cause)
    {
        super(cause);
        this.isRetryable = true;
    }
}
/* DSpaceSWORDErrorCodes.java
 *
 * Copyright (c) 2007, Aberystwyth University
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above
 *    copyright notice, this list of conditions and the
 *    following disclaimer.
 *
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 *  - Neither the name of the Centre for Advanced Software and
 *    Intelligent Systems (CASIS) nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF
 * THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 */

package org.dspace.sword;

/**
 * Some URIs for DSpace specific errors which may be reported through the SWORDErrorException
 */
public interface DSpaceSWORDErrorCodes
{
	/** if unpackaging the package fails */
	public static final String UNPACKAGE_FAIL = SWORDProperties.SOFTWARE_URI + "/errors/UnpackageFail";

	/** if the url of the request does not resolve to something meaningful */
	public static final String BAD_URL = SWORDProperties.SOFTWARE_URI + "/errors/BadUrl";

	/** if the media requested is unavailable */
	public static final String MEDIA_UNAVAILABLE = SWORDProperties.SOFTWARE_URI + "/errors/MediaUnavailable";

    /* additional codes */
    
    /** Invalid package */
	public static final String PACKAGE_ERROR = SWORDProperties.SOFTWARE_URI + "/errors/PackageError";
    
    /** Missing resources in package */
	public static final String PACKAGE_VALIDATION_ERROR = SWORDProperties.SOFTWARE_URI + "/errors/PackageValidationError";
    
    /** Crosswalk error */
	public static final String CROSSWALK_ERROR = SWORDProperties.SOFTWARE_URI + "/errors/CrosswalkError";
    
    /** Invalid collection for linking */
	public static final String COLLECTION_LINK_ERROR = SWORDProperties.SOFTWARE_URI + "/errors/CollectionLinkError";
    
    /** Database or IO Error when installing new item */
	public static final String REPOSITORY_ERROR = SWORDProperties.SOFTWARE_URI + "/errors/RepositoryError";

}

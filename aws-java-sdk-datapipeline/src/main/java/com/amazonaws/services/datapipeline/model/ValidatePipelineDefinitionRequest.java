/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.datapipeline.DataPipeline#validatePipelineDefinition(ValidatePipelineDefinitionRequest) ValidatePipelineDefinition operation}.
 * <p>
 * Validates the specified pipeline definition to ensure that it is well
 * formed and can be run without error.
 * </p>
 *
 * @see com.amazonaws.services.datapipeline.DataPipeline#validatePipelineDefinition(ValidatePipelineDefinitionRequest)
 */
public class ValidatePipelineDefinitionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String pipelineId;

    /**
     * The objects that define the pipeline changes to validate against the
     * pipeline.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject> pipelineObjects;

    /**
     * The parameter objects used with the pipeline.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ParameterObject> parameterObjects;

    /**
     * The parameter values used with the pipeline.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue> parameterValues;

    /**
     * The ID of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the pipeline.
     */
    public String getPipelineId() {
        return pipelineId;
    }
    
    /**
     * The ID of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId The ID of the pipeline.
     */
    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }
    
    /**
     * The ID of the pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId The ID of the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ValidatePipelineDefinitionRequest withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * The objects that define the pipeline changes to validate against the
     * pipeline.
     *
     * @return The objects that define the pipeline changes to validate against the
     *         pipeline.
     */
    public java.util.List<PipelineObject> getPipelineObjects() {
        if (pipelineObjects == null) {
              pipelineObjects = new com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject>();
              pipelineObjects.setAutoConstruct(true);
        }
        return pipelineObjects;
    }
    
    /**
     * The objects that define the pipeline changes to validate against the
     * pipeline.
     *
     * @param pipelineObjects The objects that define the pipeline changes to validate against the
     *         pipeline.
     */
    public void setPipelineObjects(java.util.Collection<PipelineObject> pipelineObjects) {
        if (pipelineObjects == null) {
            this.pipelineObjects = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject> pipelineObjectsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject>(pipelineObjects.size());
        pipelineObjectsCopy.addAll(pipelineObjects);
        this.pipelineObjects = pipelineObjectsCopy;
    }
    
    /**
     * The objects that define the pipeline changes to validate against the
     * pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipelineObjects The objects that define the pipeline changes to validate against the
     *         pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ValidatePipelineDefinitionRequest withPipelineObjects(PipelineObject... pipelineObjects) {
        if (getPipelineObjects() == null) setPipelineObjects(new java.util.ArrayList<PipelineObject>(pipelineObjects.length));
        for (PipelineObject value : pipelineObjects) {
            getPipelineObjects().add(value);
        }
        return this;
    }
    
    /**
     * The objects that define the pipeline changes to validate against the
     * pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipelineObjects The objects that define the pipeline changes to validate against the
     *         pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ValidatePipelineDefinitionRequest withPipelineObjects(java.util.Collection<PipelineObject> pipelineObjects) {
        if (pipelineObjects == null) {
            this.pipelineObjects = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject> pipelineObjectsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject>(pipelineObjects.size());
            pipelineObjectsCopy.addAll(pipelineObjects);
            this.pipelineObjects = pipelineObjectsCopy;
        }

        return this;
    }

    /**
     * The parameter objects used with the pipeline.
     *
     * @return The parameter objects used with the pipeline.
     */
    public java.util.List<ParameterObject> getParameterObjects() {
        if (parameterObjects == null) {
              parameterObjects = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterObject>();
              parameterObjects.setAutoConstruct(true);
        }
        return parameterObjects;
    }
    
    /**
     * The parameter objects used with the pipeline.
     *
     * @param parameterObjects The parameter objects used with the pipeline.
     */
    public void setParameterObjects(java.util.Collection<ParameterObject> parameterObjects) {
        if (parameterObjects == null) {
            this.parameterObjects = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ParameterObject> parameterObjectsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterObject>(parameterObjects.size());
        parameterObjectsCopy.addAll(parameterObjects);
        this.parameterObjects = parameterObjectsCopy;
    }
    
    /**
     * The parameter objects used with the pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterObjects The parameter objects used with the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ValidatePipelineDefinitionRequest withParameterObjects(ParameterObject... parameterObjects) {
        if (getParameterObjects() == null) setParameterObjects(new java.util.ArrayList<ParameterObject>(parameterObjects.length));
        for (ParameterObject value : parameterObjects) {
            getParameterObjects().add(value);
        }
        return this;
    }
    
    /**
     * The parameter objects used with the pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterObjects The parameter objects used with the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ValidatePipelineDefinitionRequest withParameterObjects(java.util.Collection<ParameterObject> parameterObjects) {
        if (parameterObjects == null) {
            this.parameterObjects = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ParameterObject> parameterObjectsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterObject>(parameterObjects.size());
            parameterObjectsCopy.addAll(parameterObjects);
            this.parameterObjects = parameterObjectsCopy;
        }

        return this;
    }

    /**
     * The parameter values used with the pipeline.
     *
     * @return The parameter values used with the pipeline.
     */
    public java.util.List<ParameterValue> getParameterValues() {
        if (parameterValues == null) {
              parameterValues = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue>();
              parameterValues.setAutoConstruct(true);
        }
        return parameterValues;
    }
    
    /**
     * The parameter values used with the pipeline.
     *
     * @param parameterValues The parameter values used with the pipeline.
     */
    public void setParameterValues(java.util.Collection<ParameterValue> parameterValues) {
        if (parameterValues == null) {
            this.parameterValues = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue> parameterValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue>(parameterValues.size());
        parameterValuesCopy.addAll(parameterValues);
        this.parameterValues = parameterValuesCopy;
    }
    
    /**
     * The parameter values used with the pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterValues The parameter values used with the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ValidatePipelineDefinitionRequest withParameterValues(ParameterValue... parameterValues) {
        if (getParameterValues() == null) setParameterValues(new java.util.ArrayList<ParameterValue>(parameterValues.length));
        for (ParameterValue value : parameterValues) {
            getParameterValues().add(value);
        }
        return this;
    }
    
    /**
     * The parameter values used with the pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterValues The parameter values used with the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ValidatePipelineDefinitionRequest withParameterValues(java.util.Collection<ParameterValue> parameterValues) {
        if (parameterValues == null) {
            this.parameterValues = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue> parameterValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue>(parameterValues.size());
            parameterValuesCopy.addAll(parameterValues);
            this.parameterValues = parameterValuesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPipelineId() != null) sb.append("PipelineId: " + getPipelineId() + ",");
        if (getPipelineObjects() != null) sb.append("PipelineObjects: " + getPipelineObjects() + ",");
        if (getParameterObjects() != null) sb.append("ParameterObjects: " + getParameterObjects() + ",");
        if (getParameterValues() != null) sb.append("ParameterValues: " + getParameterValues() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode()); 
        hashCode = prime * hashCode + ((getPipelineObjects() == null) ? 0 : getPipelineObjects().hashCode()); 
        hashCode = prime * hashCode + ((getParameterObjects() == null) ? 0 : getParameterObjects().hashCode()); 
        hashCode = prime * hashCode + ((getParameterValues() == null) ? 0 : getParameterValues().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ValidatePipelineDefinitionRequest == false) return false;
        ValidatePipelineDefinitionRequest other = (ValidatePipelineDefinitionRequest)obj;
        
        if (other.getPipelineId() == null ^ this.getPipelineId() == null) return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false) return false; 
        if (other.getPipelineObjects() == null ^ this.getPipelineObjects() == null) return false;
        if (other.getPipelineObjects() != null && other.getPipelineObjects().equals(this.getPipelineObjects()) == false) return false; 
        if (other.getParameterObjects() == null ^ this.getParameterObjects() == null) return false;
        if (other.getParameterObjects() != null && other.getParameterObjects().equals(this.getParameterObjects()) == false) return false; 
        if (other.getParameterValues() == null ^ this.getParameterValues() == null) return false;
        if (other.getParameterValues() != null && other.getParameterValues().equals(this.getParameterValues()) == false) return false; 
        return true;
    }
    
    @Override
    public ValidatePipelineDefinitionRequest clone() {
        
            return (ValidatePipelineDefinitionRequest) super.clone();
    }

}
    
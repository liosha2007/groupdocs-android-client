package com.github.liosha2007.groupdocs.model.common;

import java.util.ArrayList;
import java.util.List;

public class JobDocumentsEntry {
    private List<JobInputDocument> inputs = new ArrayList<JobInputDocument>();
    private List<JobOutputDocument> outputs = new ArrayList<JobOutputDocument>();

    public List<JobInputDocument> getInputs() {
        return inputs;
    }

    public void setInputs(List<JobInputDocument> inputs) {
        this.inputs = inputs;
    }

    public List<JobOutputDocument> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<JobOutputDocument> outputs) {
        this.outputs = outputs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobDocumentsEntry that = (JobDocumentsEntry) o;

        if (inputs != null ? !inputs.equals(that.inputs) : that.inputs != null) return false;
        if (outputs != null ? !outputs.equals(that.outputs) : that.outputs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = inputs != null ? inputs.hashCode() : 0;
        result = 31 * result + (outputs != null ? outputs.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("JobDocumentsEntry");
        sb.append("{inputs=").append(inputs);
        sb.append(", outputs=").append(outputs);
        sb.append('}');
        return sb.toString();
    }
}


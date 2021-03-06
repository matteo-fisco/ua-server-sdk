/*
 * digitalpetri OPC-UA SDK
 *
 * Copyright (C) 2015 Kevin Herron
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.digitalpetri.opcua.sdk.server.model.variables;

import java.util.Optional;

import com.digitalpetri.opcua.sdk.core.model.variables.TransitionVariableType;
import com.digitalpetri.opcua.sdk.core.nodes.VariableNode;
import com.digitalpetri.opcua.sdk.core.nodes.VariableTypeNode;
import com.digitalpetri.opcua.sdk.server.api.UaNodeManager;
import com.digitalpetri.opcua.stack.core.types.builtin.DataValue;
import com.digitalpetri.opcua.stack.core.types.builtin.DateTime;
import com.digitalpetri.opcua.stack.core.types.builtin.LocalizedText;
import com.digitalpetri.opcua.stack.core.types.builtin.NodeId;
import com.digitalpetri.opcua.stack.core.types.builtin.QualifiedName;
import com.digitalpetri.opcua.stack.core.types.builtin.unsigned.UByte;
import com.digitalpetri.opcua.stack.core.types.builtin.unsigned.UInteger;

@com.digitalpetri.opcua.sdk.server.util.UaVariableNode(typeName = "0:TransitionVariableType")
public class TransitionVariableNode extends BaseDataVariableNode implements TransitionVariableType {

    public TransitionVariableNode(
            UaNodeManager nodeManager,
            NodeId nodeId,
            VariableTypeNode variableTypeNode) {

        super(nodeManager, nodeId, variableTypeNode);
    }

    public TransitionVariableNode(
            UaNodeManager nodeManager,
            NodeId nodeId,
            QualifiedName browseName,
            LocalizedText displayName,
            Optional<LocalizedText> description,
            Optional<UInteger> writeMask,
            Optional<UInteger> userWriteMask,
            DataValue value,
            NodeId dataType,
            Integer valueRank,
            Optional<UInteger[]> arrayDimensions,
            UByte accessLevel,
            UByte userAccessLevel,
            Optional<Double> minimumSamplingInterval,
            boolean historizing) {

        super(nodeManager, nodeId, browseName, displayName, description, writeMask, userWriteMask,
                value, dataType, valueRank, arrayDimensions, accessLevel, userAccessLevel, minimumSamplingInterval, historizing);
    }


    @Override
    public Object getId() {
        Optional<Object> property = getProperty(TransitionVariableType.ID);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getIdNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(TransitionVariableType.ID.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setId(Object value) {
        setProperty(TransitionVariableType.ID, value);
    }

    @Override
    public QualifiedName getName() {
        Optional<QualifiedName> property = getProperty(TransitionVariableType.NAME);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getNameNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(TransitionVariableType.NAME.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setName(QualifiedName value) {
        setProperty(TransitionVariableType.NAME, value);
    }

    @Override
    public UInteger getNumber() {
        Optional<UInteger> property = getProperty(TransitionVariableType.NUMBER);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getNumberNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(TransitionVariableType.NUMBER.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setNumber(UInteger value) {
        setProperty(TransitionVariableType.NUMBER, value);
    }

    @Override
    public DateTime getTransitionTime() {
        Optional<DateTime> property = getProperty(TransitionVariableType.TRANSITION_TIME);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getTransitionTimeNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(TransitionVariableType.TRANSITION_TIME.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setTransitionTime(DateTime value) {
        setProperty(TransitionVariableType.TRANSITION_TIME, value);
    }

    @Override
    public DateTime getEffectiveTransitionTime() {
        Optional<DateTime> property = getProperty(TransitionVariableType.EFFECTIVE_TRANSITION_TIME);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getEffectiveTransitionTimeNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(TransitionVariableType.EFFECTIVE_TRANSITION_TIME.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setEffectiveTransitionTime(DateTime value) {
        setProperty(TransitionVariableType.EFFECTIVE_TRANSITION_TIME, value);
    }

}
